import javax.swing.*;
import java.awt.*;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:04
 */
public class Marco extends JFrame {

    private PanelTitulo panelTitulo;
    private VentanaLista ventanaLista;

    public Marco() {
        super("Listas");

        try{

            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        }
        catch (Exception e) {
            e.printStackTrace();
        }



        panelTitulo = new PanelTitulo();
        add(panelTitulo, BorderLayout.NORTH);


        ventanaLista = new VentanaLista();
        add(ventanaLista, BorderLayout.CENTER);




        setPreferredSize(new Dimension(600, 400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }
}
