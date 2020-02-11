import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
        Scanner a = new Scanner(System.in);
        String c = a.next();


        int columnaAlfil = (int)(c.charAt(0)) - 96;
        int filaAlfil = (int)(c.charAt(1)) - 48;

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) &&
                        (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print((char)(columna + 96) + "" + fila + " ");
                }
            }
        }
    }
}
