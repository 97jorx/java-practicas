import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:59
 */
public class VentanaLogin extends JPanel {

    private JLabel usuario;
    private JLabel password;
    private JTextField usuarioTexto;
    private JPasswordField passwordText;
    private JButton entrar;
    private Icuenta usuarioLectura;
    private JCheckBox showPassword;
    private JLabel olvidarPassword;
    private JLabel certificadoDigital;


    public VentanaLogin() {
        Dimension dimension = getPreferredSize();
        dimension.width = 150;
        setPreferredSize(dimension);


        usuario = new JLabel("Nombre usuario ");
        password = new JLabel("Contraseña ");
        usuarioTexto = new JTextField(14);
        passwordText = new JPasswordField(14);
        showPassword = new JCheckBox("Mostrar password");

        entrar = new JButton("Entrar");
        entrar.setHorizontalTextPosition(SwingConstants.CENTER);
        entrar.setBorder(BorderFactory.createEmptyBorder());


        olvidarPassword = new JLabel("¿ Olvidó su password ?");
        certificadoDigital = new JLabel("¿ Aun no te has registrado ?");



        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioTexto.getText();
                String password = String.valueOf(passwordText.getPassword());

                Usuario ev = new Usuario(this, usuario, password );


                if (usuarioLectura != null) {
                    usuarioLectura.formEventOcurred(ev);
                }
            }
        });



        showPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPassword.isSelected()) {
                    passwordText.setEchoChar((char)0);
                } else
                    passwordText.setEchoChar('*');
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
        add(passwordText, go);

        go.gridy = 3;
        go.gridx = 2;
        go.insets = new Insets(0, 15, 0, 5);
        go.anchor = GridBagConstraints.BASELINE_LEADING;
        add(password, go);


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
        add(showPassword, go);

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
        add(olvidarPassword, go);

    }

    public void setCountListener(Icuenta usuarioLectura) {
        this.usuarioLectura = usuarioLectura;
    }
}
