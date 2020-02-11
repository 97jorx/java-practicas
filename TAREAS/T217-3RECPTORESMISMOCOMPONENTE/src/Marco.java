import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * FECHA  : 20/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:29
 */

public class Marco extends JFrame {

    private JTextArea textArea;
    private JButton btn;
    private JScrollBar scroll;


    public Marco(String titulo) {
        super(titulo);

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Hola");
        scroll = new JScrollBar();


        textArea.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                textArea.append("Estoy moviendo la rueda del ratón\n");
            }
        });


        textArea.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                textArea.append("Dragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                textArea.append(".\n");
            }
        });

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_1) {
                    textArea.append("Estoy pulsando el numero 1 del teclado ");
                }
            }
        });



        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.EAST);
        add(scroll, BorderLayout.WEST);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}

