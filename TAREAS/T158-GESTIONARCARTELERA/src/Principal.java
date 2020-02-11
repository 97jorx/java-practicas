import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * FECHA  : 12/03/2019
 * NOMBRE : JORGE
 * HORA   : 14:56
 */
public class Principal {


    public static void main(String[] args) {

        HashMap<Integer,Entrada> entrada = new HashMap<>();

        LinkedList<String> reparto1 = new LinkedList();
        reparto1.add("Johnny Depp");
        reparto1.add("Brad Pitt");
        reparto1.add("Tom Cruise");
        LinkedList<String> reparto2 = new LinkedList();
        reparto2.add("Johnny Depp");
        reparto2.add("Brad Pitt");
        reparto2.add("Tom Cruise");
        LinkedList<String> reparto3 = new LinkedList();
        reparto3.add("Johnny Depp");
        reparto3.add("Brad Pitt");
        reparto3.add("Tom Cruise");

        entrada.put(1, new Entrada("El tomate asesino", reparto1));
        entrada.put(2, new Entrada("El legado", reparto2));
        entrada.put(3, new Entrada("Dos tontos muy tontos", reparto3));


        Entrada.mostrar(entrada);

    }
}
