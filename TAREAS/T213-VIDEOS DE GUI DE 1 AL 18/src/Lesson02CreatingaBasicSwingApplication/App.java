package Lesson02CreatingaBasicSwingApplication;

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
                JFrame frame = new JFrame("Hello World");
                frame.setSize(600, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}
