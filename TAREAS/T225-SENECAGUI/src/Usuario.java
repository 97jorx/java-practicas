import java.util.EventObject;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 21:14
 */
public class Usuario extends EventObject {


    private String usuario;
    private String contraseña;


    public Usuario(Object source, String usuario, String contraseña) {
        super(source);
        setUsuario(usuario);
        setContraseña(contraseña);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
