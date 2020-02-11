import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelBase extends JPanel {


    private JLabel etiqueta;
    private VentanaLogin ventanaLogin;
    private BufferedImage imagen;
    private JLabel etiquetaImagen;
    private JLabel accesoSeneca;
    private BufferedImage seneca;
    private JPanel inicio;


    public PanelBase() {

        try {
            imagen = ImageIO.read(new File("image_gallery_seneca.png"));
            seneca = ImageIO.read(new File("seneca.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        inicio = new JPanel();
        accesoSeneca = new JLabel(new ImageIcon(seneca));
        etiquetaImagen = new JLabel(new ImageIcon(imagen));
        etiquetaImagen.setText("<html>Ahora mismo hay 1368 usuarios <br> conectados a Séneca</html>");
        ventanaLogin = new VentanaLogin();
        etiqueta = new JLabel("<html>!Atención! Horario de mantenimiento de Séneca.   Nuestro horario habitual de " +
                "<br>"+"parada de lunes a viernes entre las 15:30 y las 16:30, se verá modificado durante el" +
                "<br>"+"periodo comprendido entre el 9 y el 25 de mayo, que pasará a ser de lunes a viernes" +
                "<br>"+"entre las 15:00 y las 16:00.</html>");

        inicio.setPreferredSize(new Dimension(100,100));
        inicio.add(etiquetaImagen);
        inicio.add(accesoSeneca);


        setLayout(new BorderLayout());
        add(inicio, BorderLayout.NORTH);
        add(ventanaLogin, BorderLayout.CENTER);
        add(etiqueta, BorderLayout.SOUTH);
        etiqueta.setForeground(Color.RED);



    }
}
