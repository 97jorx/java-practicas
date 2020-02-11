import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {

    private Boton boton1;
    private Boton boton2;
    private Boton boton3;
    private Boton boton4;


    public PanelBotones() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        boton1 = new Boton(new ImageIcon("boton1.PNG"));
        boton2 = new Boton(new ImageIcon("boton2.PNG"));
        boton3 = new Boton(new ImageIcon("boton3.PNG"));
        boton4 = new Boton(new ImageIcon("boton4.PNG"));

      /*boton1.setBorder(BorderFactory.createEmptyBorder());
        boton2.setBorder(BorderFactory.createEmptyBorder());
        boton3.setBorder(BorderFactory.createEmptyBorder());
        boton4.setBorder(BorderFactory.createEmptyBorder());*/

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);


    }

    public Boton getBoton1() {
        return boton1;
    }

    public Boton getBoton2() {
        return boton2;
    }

    public Boton getBoton3() {
        return boton3;
    }

    public Boton getBoton4() {
        return boton4;
    }
}
