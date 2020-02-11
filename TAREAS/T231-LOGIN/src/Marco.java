import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 18:04
 */
public class Marco extends JFrame {


    private VentanaLogin ventanaLogin;
    private JDialog dialog;
    private String patternPass;
    private String patternName;
    public Marco() {
        super("Login");

        ventanaLogin = new VentanaLogin();
        add(ventanaLogin, BorderLayout.CENTER);


        dialog = new JDialog(this, "Registro/Login");
        setLocationRelativeTo(this);
        dialog.setModal(true);
        dialog.setLayout(new BorderLayout());
        dialog.setLocationRelativeTo(null);
        dialog.setBounds(500, 500, 300, 100);
        dialog.setResizable(false);
        dialog.setVisible(false);
        JLabel label = new JLabel("Advertencia incorrecto usuario/contraseña");
        label.setForeground(Color.red);
        dialog.add(label, BorderLayout.CENTER);

        ventanaLogin.setCountListener(new Icuenta() {
            @Override
            public void formEventOcurred(Usuario e) {
                if (e.getPassword().matches("^[A-Za-z]{1,8}$") || e.getUsuario().matches("^[A-Za-z]{1,8}$")){
                    dialog.setVisible(true);
                }
            }
        });


        setPreferredSize(new Dimension(250, 250));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }
}
