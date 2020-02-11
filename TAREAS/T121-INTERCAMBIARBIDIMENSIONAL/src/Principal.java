public class Principal {

    public static void main(String[] args) {

        int[][] a = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] a1 = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        intercambiarBidimensional(a,a1);
        mostrar(a1);
        System.out.println();
        mostrar(a);
    }


    public static void intercambiarBidimensional(int[][] a, int[][] a1) {
        assert a != null : "Error : el array no puede ser nulo";
        assert a1 != null : "Error : el array no puede ser nulo";
        assert a.length == a1.length : "Error : las filas del array tiene que ser igual";

        int[][] aux = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                aux[i][j] = a[i][j];
                a[i][j] = a1[i][j];
                a1[i][j] = aux[i][j];
            }
        }
    }

    public static void mostrar(int[][] a) {
        String r = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j > 0)
                    System.out.print(", ");
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
