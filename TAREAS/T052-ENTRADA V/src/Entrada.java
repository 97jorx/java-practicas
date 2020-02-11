import java.util.Scanner;

 public class Entrada {
     private static Scanner sc = new Scanner(System.in);
     private Entrada() {
     }

     public static char leerOpcion(String opciones) {
         System.out.println("Elija una opción entre : "+opciones);
         char caracter = sc.nextLine().charAt(0);
         assert opciones.indexOf(caracter) >= 0 : "Error : opcion incorrecta";
         return caracter;
     }

 }
