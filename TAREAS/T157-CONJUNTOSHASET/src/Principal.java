import java.util.HashSet;

/**
 * FECHA  : 12/03/2019
 * NOMBRE : JORGE
 * HORA   : 13:36
 */
public class Principal {

    public static void main(String[] args) {

        HashSet<Integer> A = new HashSet<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        HashSet<Integer> B = new HashSet<>();
        B.add(1);
        B.add(3);
        B.add(5);

        // INTERSECCION
        System.out.printf(" Conjunto A : %s\n Conjunto B : %s\n ",A,B);
        System.out.printf("%s  INTERSECCION : %s\n", A, A.retainAll(B));

       /* // UNION
        System.out.printf(" Conjunto A : %s\n Conjunto B : %s\n ",A,B);
        System.out.printf("%s  UNION : %s\n", A, A.addAll(B));

        // PERTENENCIA
        System.out.printf(" Conjunto A : %s\n Conjunto B : %s\n ",A,B);
        System.out.printf("%s  PERTENENCIA : %s\n", A,  A.containsAll(B));

        // INCLUSION
        System.out.printf(" Conjunto A : %s\n Conjunto B : %s\n ",A,B);
        System.out.printf("%s  INCLUSION : %s\n", A,  A.containsAll(B));

        // DIFERENCIA
        System.out.printf(" Conjunto A : %s\n Conjunto B : %s\n ", A, B);
        System.out.printf("%s  DIFERENCIA : %s\n", A, A.removeAll(B));
*/
    }

}
