import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * FECHA  : 12/03/2019
 * NOMBRE : JORGE
 * HORA   : 22:10
 */
public class Entrada {

    private String pelicula;
    private LinkedList<String> reparto;

    public Entrada(String pelicula, LinkedList<String> reparto) {
        setPelicula(pelicula);
        setReparto(reparto);
    }


    public void setPelicula(String pelicula) {
        assert pelicula!=null : "Error : la pelicula no puede ser nula";
        this.pelicula = pelicula;
    }

    public void setReparto(LinkedList<String> reparto) {
        assert reparto!=null : "Error : la lista no puede ser nula";
        this.reparto = reparto;
    }

    /*public static void mostrar(HashMap<Integer,Entrada> mapa){
        Iterator<Integer> itr = mapa.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }*/

    public static void mostrar(HashMap<Integer, Entrada> mapa ) {
        for (Map.Entry<Integer, Entrada> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " --> " + entrada.getValue());
        }

    }

    @Override
    public String toString() {
        return "Entrada{" +
                "pelicula='" + pelicula + '\'' +
                ", reparto=" + reparto +
                '}';
    }
}
