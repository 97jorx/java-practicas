import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener {

    private JMenuBar menuBar;

    private JMenu archivo;
    private JMenuItem menuItem1;

    private StringListener stringListener;


    public Menu() {
        setLayout(new BorderLayout());
        archivo = new JMenu("Archivo");
        menuBar = new JMenuBar();
        menuItem1 = new JMenuItem("Acomplamiento");
        menuItem1.addActionListener(this);
        menuBar.add(archivo);
        archivo.add(menuItem1);
        add(menuBar, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem clicked = (JMenuItem) e.getSource();

        if (clicked == menuItem1) {
            if (stringListener != null) {
                stringListener.setEmited("Acomplamiento");
            }
        }

    }

    public void setStringListener(StringListener stringListener) {
        this.stringListener = stringListener;
    }

}
