/**
 * FECHA  : 12/03/2019
 * NOMBRE : JORGE
 * HORA   : 22:36
 */
public class Nodo {

    private int numero;
    private Nodo siguiente;

    public Nodo(int numero) {
        this.numero = numero;
        siguiente = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o instanceof Nodo) {
            Nodo nodo = (Nodo) o;
            return numero == nodo.numero;
        }

        return false;
    }



    @Override
    public String toString() {
        return Integer.toString(numero);
    }
}
