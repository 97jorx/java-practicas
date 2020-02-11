import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        try {
           /* System.out.println(excepcionAritmetic(1, 0));

            excepcionIllegalArgument(-1);

            Semaforo s = new Semaforo(TipoColor.AMARILLO);
            s.setColor(null);
            */
            excepcionArrayOfBounds();

          /*  excepcionInputMismatch();

            excepcionNullPointer();*/

        } catch ( ArrayIndexOutOfBoundsException | InputMismatchException | NullPointerException | IllegalStateException
                | IllegalArgumentException | ArithmeticException e) {
            e.printStackTrace();
        }


    }

    public static int excepcionAritmetic(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }


    public static void excepcionIllegalArgument(int peso) throws IllegalArgumentException {
        if (peso <= 0)
            throw new IllegalArgumentException("Error : el peso no puede ser 0 o negativo");

    }

    public static void excepcionArrayOfBounds() {

        try {
            int[] a = new int[4];
            System.out.print(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error : se ha accedido a una posicion mayor que la longitud del array " + e);
        }


    }


    public static void excepcionNullPointer() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void excepcionInputMismatch() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero : ");
            int a = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }


}






