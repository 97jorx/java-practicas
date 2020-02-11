import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:59
 */
public class VentanaLogin extends JPanel {

    private JLabel usuario;
    private JLabel contraseña;
    private JTextField usuarioTexto;
    private JPasswordField contraseñaTexto;
    private JButton entrar;
    private UsuarioLectura usuarioLectura;
    private JCheckBox mostrarContraseña;
    private JLabel olvidarContraseña;
    private JLabel certificadoDigital;


    public VentanaLogin() {
        Dimension dimension = getPreferredSize();
        dimension.width = 150;
        setPreferredSize(dimension);


        usuario = new JLabel("Nombre usuario ");
        contraseña = new JLabel("Contraseña ");
        usuarioTexto = new JTextField(14);
        contraseñaTexto = new JPasswordField(14);
        mostrarContraseña = new JCheckBox("Mostrar contraseña");

        entrar = new JButton("Entrar", new ImageIcon("blue.jpg"));
        entrar.setHorizontalTextPosition(SwingConstants.CENTER);
        entrar.setBorder(BorderFactory.createEmptyBorder());
        entrar.setForeground(Color.white);

        olvidarContraseña = new JLabel("¿Olvidó su contraseña?");
        certificadoDigital = new JLabel("Acceso con Certificado Digital");



        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioTexto.getText();
                String contraseña = String.valueOf(contraseñaTexto.getPassword());

                Usuario ev = new Usuario(this, usuario, contraseña);
                System.out.println(usuario);
                System.out.println(contraseña);

                if (usuarioLectura != null) {
                    usuarioLectura.formEventOcurred(ev);
                }
            }
        });


        mostrarContraseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mostrarContraseña.isSelected()) {
                    contraseñaTexto.setEchoChar((char)0);
                } else
                    contraseñaTexto.setEchoChar('*');
            }
        });


        Border innerBorder = BorderFactory.createTitledBorder("");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints go = new GridBagConstraints();


        /*// IMAGEN SENECA
        go.weightx = 2;
        go.weighty = 0.1;

        go.gridy = 0;
        go.gridx = 2;
        go.anchor = GridBagConstraints.BASELINE_LEADING;
        go.insets = new Insets(0, 15, 0, 0);
        add(accesoSeneca, go);*/


        //PRIMERO LINEA

        go.weightx = 2;
        go.weighty = 0.1;

        go.gridy = 1;
        go.gridx = 2;
        go.anchor = GridBagConstraints.BASELINE_LEADING;
        go.insets = new Insets(0, 15, 0, 0);
        add(usuario, go);

        go.gridy = 2;
        go.gridx = 2;
        go.insets = new Insets(0, 15, 0, 0);
        go.anchor = GridBagConstraints.BASELINE_LEADING;
        add(usuarioTexto, go);

        //SEGUNDA LINEA
        go.weightx = 1;
        go.weighty = 0.1;

        go.gridy = 4;
        go.gridx = 2;
        go.insets = new Insets(0, 15, 0, 0);
        go.anchor = GridBagConstraints.BASELINE_LEADING;
        add(contraseñaTexto, go);

        go.gridy = 3;
        go.gridx = 2;
        go.insets = new Insets(0, 15, 0, 5);
        go.anchor = GridBagConstraints.BASELINE_LEADING;
        add(contraseña, go);


        //CUARTA LINEA
        go.weightx = 1;
        go.weighty = 2.0;

        go.gridy = 5;
        go.gridx = 2;
        go.insets = new Insets(0, 0, 0, 0);
        go.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
        add(entrar, go);

        go.weightx = 1;
        go.weighty = 2.0;

        go.gridy = 5;
        go.gridx = 2;
        go.insets = new Insets(0, 15, 0, 0);
        go.anchor = GridBagConstraints.FIRST_LINE_START;
        add(mostrarContraseña, go);

        // ULTIMA LINEA
        go.weightx = 1;
        go.weighty = 0.1;

        go.gridy = 5;
        go.gridx = 2;
        go.insets = new Insets(0, 15, 0, 5);
        go.anchor = GridBagConstraints.LAST_LINE_END;
        add(certificadoDigital, go);

        go.weightx = 1;
        go.weighty = 0.1;

        go.gridy = 6;
        go.gridx = 2;
        go.insets = new Insets(0, 15, 0, 5);
        go.anchor = GridBagConstraints.ABOVE_BASELINE;
        add(olvidarContraseña, go);

    }

    public void setFormListener(UsuarioLectura usuarioLectura) {
        this.usuarioLectura = usuarioLectura;
    }
}
