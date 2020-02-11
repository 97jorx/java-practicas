package Lesson07CommunicationBetweenComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:15
 */
public class Toolbar extends JPanel implements ActionListener {

    private JButton helloButton;
    private JButton goodbyeButton;

    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT)); // esto no es necesario

        add(helloButton);
        add(goodbyeButton);
    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if(clicked == helloButton) {
            textPanel.appendText("Hello\n");
        } else if (clicked == goodbyeButton){
            textPanel.appendText("Goodbye\n");
        }
    }

}
