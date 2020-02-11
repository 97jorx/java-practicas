import java.util.SortedSet;
import java.util.TreeSet;

/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 15:48
 */
public class Principal {

    public static void main(String[] args) {
        SortedSet<Casa> casas = new TreeSet<>();


        Casa c1=new Casa(53);
        Casa c2=new Casa(51);
        Casa c3=new Casa(52);

        casas.add(c1);
        casas.add(c2);
        casas.add(c3);


        System.out.println(casas);
    }

}
