import java.util.Scanner;

public class Entrada
{
    private static Scanner sc = new Scanner(System.in);

    private Entrada(){

    }
    
    public static String leerAlias() {
        String alias = "";
        boolean correcto = false;

        do {
            System.out.println("Introduce un alias: ");
            alias = sc.nextLine();
            correcto =  alias.isEmpty();

            if(correcto)
                System.out.println("Error: vuelve a introducir un alias");

        } while(correcto);

        return alias;
    }



    public static boolean llevaGafas(){
        String gafas = "";
        boolean correcto;

        do {
            System.out.println("Introduce SI o NO si lleva gafas: ");
            gafas = sc.nextLine();
            correcto =    gafas.toLowerCase().equals("no")
                       || gafas.toLowerCase().equals("si");

            if(!correcto)
                System.out.println("Error: vuelve a introducir SI/NO");

        } while(!correcto);

        return gafas.toLowerCase().equals("si");
    }

    public static boolean leerFuma(){
        String gafas = "";
        boolean correcto;

        do {
            System.out.println("Introduce SI o NO si fuma: ");
            gafas = sc.nextLine();
            correcto =    gafas.toLowerCase().equals("no")
                    || gafas.toLowerCase().equals("si");

            if(!correcto)
                System.out.println("Error: vuelve a introducir SI/NO");

        } while(!correcto);

        return gafas.toLowerCase().equals("si");
    }

    public static boolean leerSombrero(){
        String gafas = "";
        boolean correcto;

        do {
            System.out.println("Introduce SI o NO si lleva sombrero: ");
            gafas = sc.nextLine();
            correcto =    gafas.toLowerCase().equals("no")
                    || gafas.toLowerCase().equals("si");

            if(!correcto)
                System.out.println("Error: vuelve a introducir SI/NO");

        } while(!correcto);

        return gafas.toLowerCase().equals("si");
    }

    public static char leerGenero() {
        String generos = "VF";
        char genero = ' ';
        boolean correcto;

        do {
            System.out.print("Generos V o F: ");
            genero = sc.next().charAt(0);
            correcto = generos.indexOf(genero)>=0;

            if (!correcto)
                System.out.println("Error : el genero no es valido");

        } while (!correcto);

        return genero;
    }


    public static TipoColorPelo leerColorPelo() {
        String pelo = "";
        boolean correcto;

        do {
            System.out.print("Colores : AMARILLO, BLANCO, NEGRO, ROJO ");

            pelo = sc.nextLine();
            correcto = pelo.isEmpty()
                        || TipoColorPelo.AMARILLO.equals(pelo)
                        || TipoColorPelo.ROJO.equals(pelo)
                        || TipoColorPelo.NEGRO.equals(pelo)
                        || TipoColorPelo.BLANCO.equals(pelo);


            switch (pelo) {
                case "AMARILLO":
                case "amarillo":
                    return TipoColorPelo.AMARILLO;
                case "BLANCO":
                case "blanco":
                    return TipoColorPelo.BLANCO;
                case "NEGRO":
                case "negro":
                    return TipoColorPelo.NEGRO;
                case "ROJO":
                case "rojo":
                    return TipoColorPelo.ROJO;
                default:
                    correcto = false;
                    System.out.println("Error : vuelve a introducir otro color");
            }

        } while (!correcto);

        return null;
    }

}

