import javax.swing.*;
import java.awt.*;

/**
 * FECHA  : 30/04/2019
 * NOMBRE : JORGE
 * HORA   : 13:32
 */
public class FormaPanel extends JPanel {

    private JTextArea cajaTexto;
    private Casilla boton1;
    private Casilla boton2;
    private Casilla boton3;
    private Casilla boton4;
    private JTextField campoTexto;

    public FormaPanel() {

        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(new GridBagLayout());

        cajaTexto = new JTextArea("Area texto");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        // El area de texto debe estirarse en ambos sentidos.
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        this.add(cajaTexto, constraints);
        constraints.weighty = 0.0;


        boton1 = new Casilla("Boton 1");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        // El botón 1 debe ocupar la posición NORTH de su celda
        constraints.anchor = GridBagConstraints.NORTH;
        // El botón 1 no debe estirarse. Habíamos cambiado este valor en el
        // area de texto, asi que lo restauramos.
        constraints.fill = GridBagConstraints.NONE;
        this.add(boton1, constraints);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weighty = 0.0;


        boton2 = new Casilla("Boton 2");
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        // El boton 2 debe ocupar la posición NORTH de su celda.
        constraints.anchor = GridBagConstraints.NORTH;
        this.add(boton2, constraints);
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.CENTER;


        boton3 = new Casilla("Boton 3");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.add(boton3, constraints);

        boton4 = new Casilla("Boton 4");
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.add(boton4, constraints);

        campoTexto = new JTextField("Campo texto");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        // El campo de texto debe estirarse sólo en horizontal.
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(campoTexto, constraints);


    }
}
