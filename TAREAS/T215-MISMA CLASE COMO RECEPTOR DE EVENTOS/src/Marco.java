import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * FECHA  : 20/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:29
 */

public class Marco extends JFrame implements ActionListener{

    private JTextArea textArea;
    private JButton btn;

    public Marco(String titulo) {
        super(titulo);

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);

        btn = new JButton();
        add(btn, BorderLayout.NORTH);
        btn.setPreferredSize(new Dimension(100, 100));

        btn.addActionListener(this);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.append("Hola");
    }


}

