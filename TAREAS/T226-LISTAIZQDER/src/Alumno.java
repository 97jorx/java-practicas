import java.util.EventObject;

/**
 * FECHA  : 21/04/2019
 * NOMBRE : JORGE
 * HORA   : 21:14
 */
public class Alumno extends EventObject {


    private String alias;
    private int peso;


    public Alumno(Object source, String usuario, int peso) {
        super(source);
        setAlias(usuario);
        setPeso(peso);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String usuario) {
        this.alias = usuario;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
