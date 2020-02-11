import java.util.ArrayList;
import java.util.List;

/**
 * FECHA  : 10/03/2019
 * NOMBRE : JORGE
 * HORA   : 18:58
 *
 * Actividad 6.2 Analizar y probar el código siguiente para ver si se da autoboxing o boxing
 *
 */
public class Act62 {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add((int)Math.PI);
        li.add((int)Math.PI);
        li.add((int)Math.PI);
        li.add((int)Math.PI);

        for (Integer e: li) {
            System.out.println(e);
        }


    }

    public static int sumarPares(List<Integer> li) {
        int sum = 0;
        for (Integer i: li)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }

}
