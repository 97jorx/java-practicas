import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame {

    JTabbedPane tp;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JButton button;


    public Marco() throws HeadlessException {


        JTextArea ta = new JTextArea(200, 200);
        button = new JButton(new ImageIcon("BUTTON.png"));
        p1 = new JPanel();
        p1.add(button);
        p1.add(ta);
        p2 = new JPanel();
        p3 = new JPanel();


        tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("Pestaña 1", p1);
        tp.add("Pestaña 2", p2);
        tp.add("Pestaña 3", p3);
        add(tp);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,400));
        pack();
        setVisible(true);
    }
}
