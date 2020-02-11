/**
 * FECHA  : 12/03/2019
 * NOMBRE : JORGE
 * HORA   : 22:36
 */
public class Lista {

    private Nodo inicio;
    private int id;

    public Lista() {
        inicio = null;
        id = 0;
    }


    public void agregar(Nodo nuevo) {
        if (estaVacia()) {
            inicio = nuevo;
            id++;
            return;
        }

        Nodo aux = inicio;
        while (aux.getSiguiente() != null)
            aux = aux.getSiguiente();
        aux.setSiguiente(nuevo);
        id++;
    }

    public void insertar(Nodo nuevo) {
        if (estaVacia())
            inicio = nuevo;
        else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        id++;

    }


    public int getId() {
        return id;
    }

    public void borrar() {
        inicio = null;
        id = 0;
    }

    public boolean buscar(Nodo n){
        Nodo aux = inicio;
        boolean encontrado = false;

        while(aux.getSiguiente() != null){
            if ( aux.equals(aux.getSiguiente()))
                encontrado = true;
            aux = aux.getSiguiente();

        }
        return encontrado;
    }

    public boolean insertarAntes(Nodo nuevo, Nodo n) {
        if (estaVacia())
            return false;
        return true;
    }

    public boolean insertarDespues(Nodo nuevo, Nodo n) {
        if (estaVacia())
            return false;
        return true;
    }


    public boolean estaVacia() {
        return inicio == null;
    }


    @Override
    public String toString() {
        if (estaVacia())
            return "";

        String texto = "";
        Nodo aux = inicio;
        while (aux.getSiguiente() != null) {
            texto += aux + " ";
            aux = aux.getSiguiente();
        }
        return texto + aux;
    }

}
