import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // http://www.docjar.com/html/api/java/util/Scanner.java.html

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numero1;
        boolean correcto = false;

        do {
            try {

                System.out.println("Introduce un numero: ");
                numero = sc.nextInt();
                System.out.println("Introduce un segundo numero: ");
                numero1 = sc.nextInt();
                correcto = true;


            } catch (InputMismatchException e) {
                System.err.println("Error : el formato de numero es incorrecto" + e.getMessage() + e.getCause());
                sc.nextLine();
            }
        } while (!correcto);
        System.out.println(numero);


    }
}
