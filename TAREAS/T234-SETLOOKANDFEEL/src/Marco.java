

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import static javax.swing.SwingUtilities.updateComponentTreeUI;

public class Marco extends JFrame {

    private Menu menu;
    private PanelCentral panelCentral;

    public Marco() {
        super("Blog de notas");
/*

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        UIManager.put("Menu.border", BorderFactory.createLineBorder(Color.WHITE, 0));
        UIManager.put("MenuBar.border", BorderFactory.createLineBorder(Color.WHITE, 0));

        SwingUtilities.updateComponentTreeUI(this);
        updateComponentTreeUI(this);

*/




        menu = new Menu();
        panelCentral = new PanelCentral();

        add(panelCentral, BorderLayout.CENTER);
        add(menu, BorderLayout.NORTH);


        ImageIcon img = new ImageIcon("notepad.png");
        setIconImage(img.getImage());
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setPreferredSize(new Dimension(600,500));
        setVisible(true);
        setResizable(false);
        pack();
    }


}
