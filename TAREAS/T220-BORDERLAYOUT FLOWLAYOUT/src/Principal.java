import javax.swing.*;

/**
 * FECHA  : 29/04/2019
 * NOMBRE : JORGE
 * HORA   : 13:09
 */
public class Principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Marco();
            }
        });
    }
}
