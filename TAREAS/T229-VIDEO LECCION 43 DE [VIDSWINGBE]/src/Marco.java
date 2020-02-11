import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Marco extends JFrame {

    public Marco() {

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent arg0) {
                System.out.println("windows closing");

                int cerrar = JOptionPane.showConfirmDialog(getContentPane(), "¿ Quieres cerrar la aplicación ?",
                        "Alerta", JOptionPane.YES_NO_OPTION);
                if (cerrar == JOptionPane.YES_OPTION) {
                    dispose();
                    System.gc();
                }


            }

        });


        setPreferredSize(new Dimension(300, 300));
        setVisible(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        pack();

    }


}
