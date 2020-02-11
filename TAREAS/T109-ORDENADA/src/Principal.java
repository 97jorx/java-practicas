public class Principal {

    public static void main(String[] args) {

        int[] array1 = new int[]{9, 6, 8, 7, 2, 1, 3};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(estaOrdenada(array2));

    }

    private static boolean estaOrdenada(int[] array1) {
        assert array1 != null : "Error : el array no puede ser nulo";
        boolean correcto = true;

        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] < array1[i + 1])
                continue;
            correcto = false;
        }

        return correcto;
    }


}



