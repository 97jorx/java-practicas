import javax.swing.*;

/**
 * FECHA  : 20/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:30
 */
public class Principal {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Marco("Hello World");
            }
        });
    }
}
