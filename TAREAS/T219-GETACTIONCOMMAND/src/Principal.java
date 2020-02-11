import javax.swing.*;

/**
 * FECHA  : 28/04/2019
 * NOMBRE : JORGE
 * HORA   : 20:45
 */
public class Principal {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new Marco("Hola");
           }
       });

    }
}
