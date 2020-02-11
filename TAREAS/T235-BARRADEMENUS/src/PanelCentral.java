import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelCentral extends JPanel {

    private JTextArea textArea;


    public PanelCentral() {

        setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea();

        add(textArea, BorderLayout.CENTER);

    }
}
