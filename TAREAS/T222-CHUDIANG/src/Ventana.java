import javax.swing.*;
import java.awt.*;

/**
 * Ejemplo de uso del GridBagLayout. Ya está todo correctamente colocado.
 */
public class Ventana extends JFrame {

    FormaPanel formaPanel;

    public Ventana() {
        super("Ejemplo 3 GridBagLayout");

        formaPanel = new FormaPanel();
        add(formaPanel, BorderLayout.CENTER);

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}