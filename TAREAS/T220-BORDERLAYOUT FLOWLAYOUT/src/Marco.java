import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * FECHA  : 29/04/2019
 * NOMBRE : JORGE
 * HORA   : 13:09
 */
public class Marco extends JFrame {

    JPanel panel;
    JButton btn;
    JButton btn1;
    JMenu menu;    JMenuItem item1,item2;
    JMenuBar menuBar;
    JTextArea textArea;

    public Marco()  {
        super("BorderLayout y FlowLayout");

        // INSTANCIAR
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setSize(150,150);
        panel.setVisible(true);

        // AÑADIR AL GESTOR DE CONTENIDOS
        add(panel, BorderLayout.NORTH);


        // INICIARLIZAR
        btn = new JButton();
        btn1 = new JButton();
        menu = new JMenu("Menu");
        item1 = new JMenuItem("1");
        item2 = new JMenuItem("Cerrar");
        menuBar = new JMenuBar();
        textArea = new JTextArea();


        // AÑADIR AL FLOWLAYOUT
        add(btn, BorderLayout.EAST);
        add(btn1, BorderLayout.WEST);
        add(textArea, BorderLayout.CENTER);

        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);
        panel.add(menuBar);


        // DIMENSIONES
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
