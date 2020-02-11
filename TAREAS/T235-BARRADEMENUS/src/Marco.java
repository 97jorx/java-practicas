

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Marco extends JFrame {

    private Menu menu;
    private PanelCentral panelCentral;

    public Marco() {
        super("Blog de notas");


        menu = new Menu();
        panelCentral = new PanelCentral();

        add(panelCentral, BorderLayout.CENTER);
        add(menu, BorderLayout.NORTH);


        ImageIcon img = new ImageIcon("notepad.png");
        setIconImage(img.getImage());
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setPreferredSize(new Dimension(300,300));
        setVisible(true);
        setResizable(false);
        pack();
    }


}
