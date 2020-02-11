import java.util.ArrayList;
import java.util.LinkedList;

/**
 * FECHA  : 11/03/2019
 * NOMBRE : JORGE
 * HORA   : 12:44
 */
public class Principal {

    public static void main(String[] args) {

        // ARRAY LIST Y LINKED LIST IMPLEMENTAN LIST Y REDEFINEN EL METODO GET

        // ArrayList get
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < 100000 ; i++)
//            arrayList.add(i);
//
//        for (int i = 0; i < 100000; i++)
//            System.out.println(arrayList.get(i));



        // LinkedList get
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 100000; i++)
            list.add(i);

        for (int i = 0; i < 100000; i++)
            System.out.println(list.get(i));

    }

}
