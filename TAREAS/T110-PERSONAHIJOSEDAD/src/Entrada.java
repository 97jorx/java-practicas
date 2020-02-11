import java.util.Scanner;

public class Entrada {


    private Entrada () {

    }

    public static int leerEdad() {

        Scanner e = new Scanner(System.in);
        System.out.print("Introduce la edad");
        int edad = e.nextInt();
        return edad;

    }

    public static int leerNumHijos() {

        Scanner e = new Scanner(System.in);
        System.out.print("Introduce numero de hijos");
        int numHijos = e.nextInt();
        return numHijos;

    }
}
