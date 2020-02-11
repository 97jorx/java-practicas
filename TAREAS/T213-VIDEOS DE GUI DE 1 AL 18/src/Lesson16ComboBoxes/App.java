package Lesson16ComboBoxes;

import javax.swing.*;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 17:57
 */
public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }

}
