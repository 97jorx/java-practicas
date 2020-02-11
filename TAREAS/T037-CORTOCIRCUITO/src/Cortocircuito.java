public class Cortocircuito {

    public static void main(String[] args) {

        boolean a = mostrar() || mostrar2();            // TRUE || (?)
        System.out.print(a);
    }


    public static boolean mostrar() {
        System.out.print("Hola");
        return true;
    }

    public static boolean mostrar2() {
        System.out.print("Adios");
        return false;
    }

}
