import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Marco();
                } catch (ClassCastException e) {
                    System.err.println("Casting incorrecto "+e);
                }
            }
        });



    }


}


