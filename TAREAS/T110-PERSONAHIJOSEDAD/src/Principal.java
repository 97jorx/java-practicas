import java.util.Arrays;
import java.util.Scanner;

public class Principal {


    private static int numero = 0;

    public static void main(String[] args) {

        mostrar(infoPersonas());
    }

    public static Persona[][] infoPersonas() {

        Scanner e = new Scanner(System.in);
        System.out.println("Introduce nº de hijos que hay en la habitacion");
        int x = e.nextInt();

        Persona[][] personas = new Persona[x][Persona.NUMATRIBUTOS];
        int maxNumHijos = 0;


        for (int i = 0; i < personas.length; i++) {
            personas[i][0] = new Persona();
            personas[i][0].setNumHijos(Entrada.leerNumHijos());
            maxNumHijos = (personas[0][0].getNumHijos() > personas[i][0].getNumHijos() ?
                           personas[0][0].getNumHijos() : personas[i][0].getNumHijos());

        }

        personas = new Persona[maxNumHijos][Persona.NUMATRIBUTOS];


        for (int i = 0; i < personas.length; i++) {
            for (int j = 1; j < personas[i].length; j++) {
                personas[i][j] = new Persona();
                personas[i][j].setEdad(Entrada.leerEdad());
            }

        }


        return personas;
    }


    public static void mostrar(Persona[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j > 0 && a[i][j] != null)
                    System.out.print(", ");
                System.out.print(/*(*/a[i][j]/*==null) ? "": a[i][j]*/);
            }
            System.out.println();
        }
    }


}
