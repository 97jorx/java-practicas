package Lesson03AddingComponents;

import javax.swing.*;
import java.awt.*;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:04
 */
public class MainFrame extends JFrame {

    private JButton btn;
    private JTextArea textArea;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Click me");


        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
