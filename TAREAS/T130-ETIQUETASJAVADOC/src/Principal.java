/**
 * @author JORGE
 * @version 1.0
 */
public class Principal {

    public static void main(String[] args) {
        int[] array = new int[]{180,193,195,195,169,168,168};
        Monitor[] m = new Monitor[]{new Monitor(1.10F),
                                    new Monitor(3.12F),
                                    new Monitor(2.17F),
                                    new Monitor(5.5F)};
        burbuja(m);
        mostrar(m);
    }


    /**
     *  Algoritmo burbuja ordena el array
     * @param arr array de tipo entero
     *
     */

    private static void burbuja(int[] arr) {
        assert arr!=null : "Error : el arr no puede ser nulo";
        int aux = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] < arr[j]) {
                    aux = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }

    }

    /**
     *  Algoritmo burbuja ordena el array de tipo ponitor por sus pulgadas
     * @param arr array de tipo Monitor
     *
     */


    private static void burbuja(Monitor[] arr) {
        assert arr!=null : "Error : el arr no puede ser nulo";
        float aux = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1].getPulgadas() < arr[j].getPulgadas()) {
                    aux = arr[j - 1].getPulgadas();
                    arr[j - 1].setPulgadas(arr[j].getPulgadas());
                    arr[j].setPulgadas(aux);
                }
            }
        }

    }


    /**
     *  Método que muestra el array de valores
     * @param valores array de tipo Monitor
     *
     */

    public static void mostrar(int[] valores) {

        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length - 1; i++)
            System.out.print(valores[i] + ",");
        System.out.print(valores[valores.length - 1]);

    }

    /**
     *  Método que muestra el array de pulgadas separados por comas de los monitores pasados como objetos.
     * @param valores array de tipo Monitor
     *
     */

    public static void mostrar(Monitor[] valores) {

        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length - 1; i++)
            System.out.print(valores[i] + ",");
        System.out.print(valores[valores.length - 1]);

    }
}
