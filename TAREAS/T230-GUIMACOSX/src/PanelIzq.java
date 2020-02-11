import javax.swing.*;
import java.awt.*;

public class PanelIzq extends JPanel {

    private JLabel inciarSesion;
    private JLabel volumenes;
    private JLabel volumen1;
    private JLabel volumen2;
    private JLabel otrosVolumenes;
    private JLabel volumen3;
    private JLabel volumen4;
    private JButton activar;
    private JButton comprar;

    public PanelIzq()  {

        setLayout(new GridLayout(9,1));


        inciarSesion = new JLabel("Iniciar sesión");
        inciarSesion.setForeground(Color.white);

        volumenes = new JLabel("Volúmenes de NTFS");
        volumenes.setBackground(new Color(0,5,50));
        volumenes.setForeground(Color.white);
        volumenes.setMaximumSize(new Dimension(4,1));
        volumenes.setOpaque(true);


        volumen1 = new JLabel("<html> INTERNOWIN <br> 200,98 GB<html/>");
        volumen1.setIcon(new ImageIcon(new ImageIcon("hardisk.png")
                .getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        volumen1.setForeground(Color.white);


        volumen2 = new JLabel("<html> EDU4TERAS <br> 4 GB <html/>");
        volumen2.setIcon(new ImageIcon(new ImageIcon("hardisk.png")
                .getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        volumen2.setForeground(Color.white);

        otrosVolumenes = new JLabel("Otros volúmenes");
        otrosVolumenes.setBackground(Color.WHITE);
        otrosVolumenes.setBackground(new Color(0,5,50));
        otrosVolumenes.setForeground(Color.white);
        otrosVolumenes.setMaximumSize(new Dimension(1,1));
        otrosVolumenes.setOpaque(true);

        volumen3 = new JLabel("<html> INTERNOMAC <br> 799 GB<html/>");
        volumen3.setIcon(new ImageIcon(new ImageIcon("hardisk.png")
                .getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        volumen3.setForeground(Color.white);

        volumen4 = new JLabel("<html> EXTERNO <br> 499,25 GB <html/>");
        volumen4.setIcon(new ImageIcon(new ImageIcon("hardisk.png")
                .getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        volumen4.setForeground(Color.white);


        add(inciarSesion);
        add(volumenes);
        add(volumen1);
        add(volumen2);
        add(otrosVolumenes);
        add(volumen3);
        add(volumen4);



    }
}
