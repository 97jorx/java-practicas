import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 16:49
 */
public class Principal {

    public static void main(String[] args) {

        /*HashMap<Perro, Integer> hashMap = new HashMap();
        Perro d1 = new Perro("Pepito");
        Perro d2 = new Perro("Juanito");
        Perro d3 = new Perro("Jorgito");

        hashMap.put(d1, 10);
        hashMap.put(d2, 15);
        hashMap.put(d3, 5);

        for (Map.Entry entrada : hashMap.entrySet()) {
            System.out.println(entrada.getKey().toString() + " : PESO " + entrada.getValue());
        }*/

        TreeMap<Perro, Integer> treeMap = new TreeMap<>();
        Perro d4 = new Perro("Pepito", 12);
        Perro d5 = new Perro("Juanito", 11);
        Perro d6 = new Perro("Jorgito", 14);

        treeMap.put(d4, 10);
        treeMap.put(d5, 15);
        treeMap.put(d6, 5);

        for (Map.Entry entrada : treeMap.entrySet()) {
            System.out.println(entrada.getKey() + " : PESO " + entrada.getValue());
        }

    }


}
