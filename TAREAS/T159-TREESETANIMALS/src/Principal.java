import java.util.Map;
import java.util.TreeMap;

/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 12:52
 */
public class Principal {

    public static void main(String[] args) {

        TreeMap<Animal, Integer> treeMap = new TreeMap<>();
        Animal d4 = new Animal("Pato",5);
        Animal d5 = new Animal("Cerdo",50);
        Animal d6 = new Animal("Vaca",150);

        treeMap.put(d4, 10);
        treeMap.put(d5, 15);
        treeMap.put(d6, 5);

        for (Map.Entry entrada : treeMap.entrySet()) {
            System.out.println(entrada.getKey() + " : TALLA " + entrada.getValue());
        }

    }

}
