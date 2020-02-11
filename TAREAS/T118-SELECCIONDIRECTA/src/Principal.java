public class Principal {
    public static void main(String[] args) {

        int[] array = {4, 15, -12, 3, 1, -1};
        mostrarArray(ordenarSeleccionDirecta(array));
    }

    public static int[] ordenarSeleccionDirecta(int[] array) {
        int posmin, aux;
        for (int i = 0; i < array.length; i++) {
            posmin = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[posmin])
                    posmin = j;

            aux = array[posmin];
            array[posmin] = array[i];
            array[i] = aux;
        }
        return array;
    }

    public static void mostrarArray(int array[]) {
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print("," + array[i]);
        }

    }
}