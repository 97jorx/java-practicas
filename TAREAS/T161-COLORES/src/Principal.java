import java.util.*;

public class Principal {

    public static void main(String[] args) {

        SortedSet<Color> ordenaColores= new TreeSet<>();


        Color c1=new Color(53);
        Color c2=new Color(51);
        Color c3=new Color(52);

        ordenaColores.add(c1);
        ordenaColores.add(c2);
        ordenaColores.add(c3);


        System.out.println(ordenaColores);

    }


}