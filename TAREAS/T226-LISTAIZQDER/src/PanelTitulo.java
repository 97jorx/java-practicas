import javax.swing.*;
import java.awt.*;

public class PanelTitulo extends JPanel {

    private JLabel etiqueta;


    public PanelTitulo() {

        etiqueta = new JLabel("Alumnos/as a evaluar");
        setBackground(Color.GRAY);
        add(etiqueta, BorderLayout.NORTH);


    }
}
