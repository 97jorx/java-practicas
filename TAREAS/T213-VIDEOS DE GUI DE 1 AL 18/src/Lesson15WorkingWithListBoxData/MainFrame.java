package Lesson15WorkingWithListBoxData;

import javax.swing.*;
import java.awt.*;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:04
 */
public class MainFrame extends JFrame {

    private JButton btn;
    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new TextPanel();
        formPanel = new FormPanel();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void setEmited(String text) {
               textPanel.appendText(text);
            }
        });

        formPanel.setFormListener(new FormListener() {
            @Override
            public void formEventOcurred(FormEvent e) {
                String name = e.getName();
                String occupation = e.getOcuppation();
                int ageCat = e.getAgeCategory();

                textPanel.appendText(name + ": " + occupation + ageCat +"\n");
            }
        });

        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
