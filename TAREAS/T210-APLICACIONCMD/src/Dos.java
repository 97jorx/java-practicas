import java.lang.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

public class Dos implements Runnable {
    private PipedOutputStream pipeout;
    private PipedOutputStream pipeerr;
    String command = "cmd";

    public Dos(String[] cmd) {
        pipeout = null;
        pipeerr = null;
    }

    public void run() {
        exec();
    }

    public void exec() {

        // Class to redirect the process input stream to a piped output stream

        class OutputMonitor implements Runnable {
            InputStream is;
            PipedOutputStream pout;

            public OutputMonitor(InputStream i, PipedOutputStream p) {
                is = i;
                pout = p;
            }

            public void run() {
                try {
                    int inputChar;

                    for (; ; ) {
                        inputChar = is.read();
                        if (inputChar == -1) {
                            break;
                        }

                        if (pout == null) {
                            System.out.write(inputChar);
                        } else {
                            pout.write(inputChar);

                        }
                    }
                    if (pout != null) {
                        pout.flush();
                        pout.close();
                    } else {
                        System.out.flush();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(command);

            OutputMonitor out = new OutputMonitor(p.getInputStream(), pipeout);
            OutputMonitor err = new OutputMonitor(p.getErrorStream(), pipeerr);

            Thread t1 = new Thread(out);
            Thread t2 = new Thread(err);

            t1.start();
            t2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public PipedInputStream getInputStream() throws IOException {
        pipeout = new PipedOutputStream();
        return new PipedInputStream(pipeout);
    }

    public PipedInputStream getErrorStream() throws IOException {
        pipeerr = new PipedOutputStream();
        return new PipedInputStream(pipeerr);
    }

    public void execInThread() {
        Thread t = new Thread(this);
        t.start();
    }

    public static JPanel getContentPane(JTextArea ta) {

        JPanel p = new JPanel(new BorderLayout());
        JPanel bottom = new JPanel(new FlowLayout());
        JButton button = new JButton(" Exit ");
        button.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         System.exit(0);
                                     }
                                 }
        );


        bottom.add(button);

        p.add(new JScrollPane(ta), BorderLayout.CENTER);
        p.add(bottom, BorderLayout.SOUTH);
        p.setPreferredSize(new Dimension(640, 480));
        return p;
    }

    public static void main(String[] arg) {

        // Class run in a thread,listens for the process output
        // and forwards it to the UI via invokeLater()

        class GuiUpdate implements Runnable {
            private PipedInputStream pin;
            private PipedInputStream perr;
            private JTextArea outputArea;

            GuiUpdate(JTextArea textArea, PipedInputStream in) {
                pin = in;
                outputArea = textArea;
            }

            public void run() {
                // Class to run on the event dispatch thread to update the GUI

                class UpdateSwing implements Runnable {
                    String update;
                    JTextArea swingTextArea;

                    public UpdateSwing(JTextArea a, String s) {
                        update = s;
                        swingTextArea = a;
                    }

                    public void run() {
                        outputArea.append(update + "\n");
                    }
                }

                try {
                    // Read file before displaying
                    BufferedReader r = new BufferedReader(new InputStreamReader(pin));
                    String line;

                    for (; ; ) {
                        line = r.readLine();
                        if (line == null) {
                            break;
                        }

                        SwingUtilities.invokeLater(new UpdateSwing(outputArea, line));

                        Thread.yield();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        // Create and invoke GUI

        JFrame f = new JFrame("GUI for Dos");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textOutput = new JTextArea();
        f.getContentPane().add(getContentPane(textOutput));
        f.pack();
        f.show();

        // Start command and capture output in the scrollable text area

        try {
            // Create command and setup the pipes

            Dos d = new Dos(arg);

            PipedInputStream stdout_pipe = d.getInputStream();
            PipedInputStream stderr_pipe = d.getErrorStream();
            d.execInThread();

            // Results

            Thread t1 = new Thread(new GuiUpdate(textOutput, stdout_pipe));
            Thread t2 = new Thread(new GuiUpdate(textOutput, stderr_pipe));

            t1.start();
            t2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
