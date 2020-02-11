package Lesson07CommunicationBetweenComponents;

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

        textPanel = new TextPanel();
        toolbar = new Toolbar();

        toolbar.setTextPanel(textPanel);

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
