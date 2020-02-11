package Lesson06SimpleToolbars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:04
 */
public class MainFrame extends JFrame {

    private JButton btn;
    private TextPanel textPanel;
    private Toolbar toolbar;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());


        btn = new JButton("Click me");
        textPanel = new TextPanel();
        toolbar = new Toolbar();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello");
            }
        });

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
