import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        System.out.println("¿ Cuantos hijos tienes ? : ");
        Scanner sc = new Scanner(System.in);
        int hijos = sc.nextInt();

        Persona[] personas = new Persona[hijos];

        String nombre;
        for (int j = 0; j < personas.length ; j++) {
            System.out.println("Introduce el nombre de los hijos : ");
            nombre = sc.next();
            personas[j] = new Persona(nombre);
        }

        mostrar(personas);
    }



    public static void mostrar(Persona[] personas){
        System.out.print(personas[0]);
        for (int i = 1; i <personas.length ; i++) {
            System.out.println(","+personas[i]);
        }


    }

}