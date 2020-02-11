import java.util.Scanner;

public class Entrada
{
   private final static Scanner s1 = new Scanner (System.in);
   private Entrada(){}

   public static int leerInt() {
       System.out.println("Introduce un entero: ");
       int a = s1.nextInt();
       return a;
   }

    public static double leerDouble() {
       System.out.println("Introduce un real: ");
       double a = s1.nextDouble();
       return a;
    }

    public static char leerChar() {
       System.out.println("Introduce una letra: " );
       char a = s1.nextLine().charAt(0);
       return a;
  }
}

