import javax.swing.*;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

          try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Marco();
            }
        });
    }
}
