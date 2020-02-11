public class Principal {

    public static void main(String[] args) {
        int[] array = new int[]{180,193,195,195,169,168,168};
        burbuja(array);
        mostrar(array);
    }


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

    public static void mostrar(int[] valores) {

        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length - 1; i++)
            System.out.print(valores[i] + ",");
        System.out.print(valores[valores.length - 1]);

    }
}
