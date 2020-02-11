import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        int[][] array = new int[][]{{1, 2, 3},
                                    {4, 5, 6},
                                    {7, 8, 9}};

        int[][] arrayT = new int[array[0].length][array.length];
        transpuesta(array,arrayT);

        for (int[] e:arrayT) {
            System.out.println(Arrays.toString(e));
        }

    }

    public static void transpuesta(int[][] array, int[][] arrayT) {
        assert array != null : "Error : el array no puede ser nulo";


        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++)
                arrayT[y][x] = array[x][y];
        }

    }

    public static void mostrar(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
