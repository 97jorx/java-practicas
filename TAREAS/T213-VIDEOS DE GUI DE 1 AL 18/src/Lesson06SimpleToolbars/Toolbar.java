package Lesson06SimpleToolbars;

import javax.swing.*;
import java.awt.*;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:15
 */
public class Toolbar extends JPanel {

    private JButton helloButton;
    private JButton goodbyeButton;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);
    }


}
