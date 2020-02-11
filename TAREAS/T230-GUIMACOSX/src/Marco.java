import com.jtattoo.plaf.TitlePane;

import javax.swing.*;
import java.awt.*;



public class Marco extends JFrame {

    PanelIzq izquierdo;
    JPanel derecho;


    public Marco() {

        //setUndecorated(true);
        izquierdo = new PanelIzq();
        izquierdo.setBackground(new Color(0,25,51));
        izquierdo.setPreferredSize(new Dimension(200,50));



        add(izquierdo, BorderLayout.WEST);


        setPreferredSize(new Dimension(650,400));
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }


}
