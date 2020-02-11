package Lesson09SettingComponentSizes;

import javax.swing.*;
import java.awt.*;

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
