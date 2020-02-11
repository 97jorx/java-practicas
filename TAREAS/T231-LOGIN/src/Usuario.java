import java.util.EventObject;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 21:14
 */
public class Usuario extends EventObject {


    private String usuario;
    private String password;


    public Usuario(Object source, String usuario, String password) {
        super(source);
        setUsuario(usuario);
        setPassword(password);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
