package Lesson07CommunicationBetweenComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:04
 */
public class TextPanel extends JPanel  {

    private JTextArea texArea;

    public TextPanel() {
        texArea = new JTextArea();

        setLayout(new BorderLayout());

        add(new JScrollPane(texArea), BorderLayout.CENTER);

    }

    public void appendText(String text){
        texArea.append(text);
    }

}
