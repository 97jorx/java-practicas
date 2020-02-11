public class Principal {
    public static void main(String[] args) {

        int[] array = {5, 7, 4, 3, 8, 2, 1, 500, 300, 200, 555};
        mostrar(ordenarSeleccionDirecta(array));

    }

    public static int[] ordenarSeleccionDirecta(int[] array) {
        assert array != null : "Error : el array no puede ser nulo";
        int posmin;
        int i;

        for (i = 0; i < array.length; i++) {
            posmin = posicionDelMinimo(i + 1, array);
            intercambiar(posmin, i, array);
        }

        return array;
    }


    private static int posicionDelMinimo(int i, int[] array) {
        assert array != null : "Error : el array no puede ser nulo";
        assert array.length>0 : "Error : el array debe ser de longitud 1 >=";
        int posmin;

        posmin = i;
        for (int j = i; j < array.length; j++)
            if (array[j] < array[posmin])
                posmin = j;

        return posmin;
    }


    private static void intercambiar(int i, int j, int[] array) {
        assert array != null : "Error : el array no puede ser nulo";

        if (array.length<=1)
           return;


        int aux;
        aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void mostrar(int array[]) {
        assert array != null : "Error : el array no puede ser nulo";
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print("," + array[i]);
        }

    }
}