public class Principal {

    public static void main(String[] args) {

        try {
            int array[] = new int[2];
            array[4] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.printf("Error : se ha accedido a una posicion mayor a la longitud del array \n %s", e);

        }

        System.err.println();

        try {
            Object a = new Animal();
            System.out.println((Coche)a);
        } catch (ClassCastException e) {
            System.err.printf("Error : se ha realizado un casting de un objeto que no es una subclase de Animal \n %s", e);

        }

        System.err.println();

        try {
            Integer integer = Integer.valueOf("a");
        } catch (NumberFormatException e) {
            System.err.printf("Error : se ha introducido un formato erroneo   \n %s", e);

        }

    }


}
