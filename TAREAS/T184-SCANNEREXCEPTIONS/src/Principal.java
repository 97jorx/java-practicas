
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            Scanner s = new Scanner(System.in);

            System.out.print("Numerador: ");
            a = s.nextInt();
            System.out.print("Denominador: ");
            b = s.nextInt();
            int x = cociente(a, b);
            System.out.println(x);
        } catch (InputMismatchException e) {
            System.out.println("Errror : se ha introducido un valor erroneo " + e);
        } catch (ArithmeticException e) {
            System.out.println("Error : no se puede dividir entre 0 " + e);
        } catch (IllegalStateException e) {
            System.out.println("Error : el scanner ha recibido un valor incorrecto " + e );
        } catch (NoSuchElementException e) {
            System.out.println("Error : el scanner se ha accedido antes de inicializarse " + e);
        } catch (RuntimeException e) {
            System.out.println("Error : una excepcion que cuelga de Runtime no especificada " + e);
        }


    }

    private static int cociente(int numerador, int denominador)
            throws NoSuchElementException, IllegalStateException, ArithmeticException {
        return numerador / denominador;
    }
}
