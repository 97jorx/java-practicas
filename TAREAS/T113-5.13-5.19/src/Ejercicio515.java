public class Ejercicio515 {


    public static void main(String[] args) {
        mostrar(matrizIdentidad());


    }

    public static int[][] matrizIdentidad(){
        int[][] a = new int[3][3];

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if(i == j)
                    a[i][j] = 1;
            }
        }
        return a;

    }


    public static void mostrar(int[][] a) {
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
