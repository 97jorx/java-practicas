import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:04
 */
public class Marco extends JFrame {


    private PanelBase panelBase;


    public Marco() {
        super("Acceso a Séneca");
/*
        for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(laf.getName()))
                try {
                    UIManager.setLookAndFeel(laf.getClassName());
                } catch (Exception ex) {
                }
        }

        setLayout(new BorderLayout());
        setDefaultLookAndFeelDecorated(true)*/;


        panelBase = new PanelBase();
        add(panelBase, BorderLayout.CENTER);


        setPreferredSize(new Dimension(250,500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }
}
