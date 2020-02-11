import javax.swing.*;

/**
 * FECHA  : 30/04/2019
 * NOMBRE : JORGE
 * HORA   : 13:32
 */
public class Casilla extends JButton {

    private JButton btn;

    public Casilla(String titulo) {
        super(titulo);
        btn = new JButton(titulo);
    }
}
