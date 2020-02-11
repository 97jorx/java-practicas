import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * FECHA  : 20/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:29
 */

public class Marco extends JFrame  {

    private JTextArea textArea;
    private JButton btn;
    private JButton btn2;


    public Marco(String titulo) {
        super(titulo);

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Clase interna anonima");
        btn2 = new JButton("Clase interna no anonima");

        btn2.addActionListener(new Mireceptor());

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Clase interna anonima\n");
            }
        });


        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        add(btn2, BorderLayout.EAST);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public class Mireceptor implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.append("Clase interna no anonima\n");
        }
    }

}

