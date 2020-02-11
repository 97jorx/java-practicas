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

    private StringListener textListener;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEADING));

        add(helloButton);
        add(goodbyeButton);
    }

    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clicked = (JButton) e.getSource();

        if (clicked == helloButton) {
            if (textListener != null) {
                textListener.setEmited("Hello\n");
            }
        } else if (clicked == goodbyeButton) {
            if (textListener != null) {
                textListener.setEmited("Goodbye\n");
            }
        }
    }

}
