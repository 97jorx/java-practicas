import java.util.ArrayList;
import java.util.LinkedList;

public class Persona {

    private String alias;
    private int peso;

    public Persona(String alias, int peso) {
        setAlias(alias);
        setPeso(peso);

    }

    /**
     * @param alias el alias no puede ser nulo ni vacio.
     * @throws NullPointerException     el alias no puede ser nulo.
     * @throws IllegalArgumentException el alias no puede ser vacio.
     */

    public void setAlias(String alias) throws NullPointerException, IllegalArgumentException {
        if (alias == null)
            throw new NullPointerException("El alias no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("El alias no puede ser vacio");
        this.alias = alias;
    }

    /**
     * @param peso el peso no puede se 0 o menor.
     * @throws UnsupportedOperationException excepcion todavia no implementada
     */

    public void setPeso(int peso) throws UnsupportedOperationException {
        if (peso < 0)
            throw new UnsupportedOperationException("excepcion todavia no implementada");
        this.peso = peso;
    }

    public ArrayList agregarAlPrincipio(ArrayList lista) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operacion invalida para una lista");
    }

}



