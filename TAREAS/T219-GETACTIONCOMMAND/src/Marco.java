import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marco extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JButton btn;
    JMenu menu, submenu;
    JMenuItem m1, m2, m3, m4, m5;
    JMenuBar mb;


    public Marco(String titulo) {
        super(titulo);

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Hola");
        mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        m1 = new JMenuItem(" 1");
        m2 = new JMenuItem(" 2");
        m3 = new JMenuItem(" 3");
        m4 = new JMenuItem(" 4");
        m5 = new JMenuItem(" 5");


        btn.setBackground(Color.GREEN);
        btn.setActionCommand("Hola");
        m1.setActionCommand("Hola");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Hola")) {
                    textArea.append("Hola");
                }
            }
        });

        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("HolaA")) {
                    textArea.append("Hola");
                }
            }
        });

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        //submenu.add(m4);
        //submenu.add(m5);
        //menu.add(submenu);
        mb.add(menu);



        setJMenuBar(mb);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // El setActionCommand permite asignar una accion al componente, ya sea boton, menu o barra para que hagan
    // lo mismo
}