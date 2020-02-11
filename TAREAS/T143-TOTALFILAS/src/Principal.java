public class Principal {

    public static void main(String[] args) {

        int[][] array = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8,9,10,12}, {1, 2, 3, 4}, {1, 2, 3}, {1, 2, 3, 4, 5, 6, 7, 8,9}};

       /* int contador;
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            contador = 0;
            for (int j = 0; j < array[i].length; j++) {
                contador++;
                if (aux < contador)
                    aux = contador;
            }
        }
        System.out.println(aux);*/

        int aux2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(aux2 < array[i].length)
                    aux2 = array[i].length;
            }
        }
        System.out.println(aux2);


    }
}
