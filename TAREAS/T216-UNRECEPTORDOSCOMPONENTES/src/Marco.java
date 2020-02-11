import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * FECHA  : 20/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:29
 */

public class Marco extends JFrame{

    private JTextArea textArea;
    private JButton btn;
    private JScrollBar scroll;


    public Marco(String titulo) {
        super(titulo);

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Hola");
        scroll = new JScrollBar();


        MouseAdapter a1 = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textArea.append("Hola");
            }
        };

        btn.addMouseListener(a1);
        scroll.addMouseListener(a1);

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.EAST);
        add(scroll, BorderLayout.WEST);

        setPreferredSize(new Dimension(400,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }


}

