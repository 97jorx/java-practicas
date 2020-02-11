public class Main  {
    public static void main(String[] args) {
        int[] array = {4,15,-12,3,1,-1};
        mostrarArray(ordenarInsercionDirecta(array));
    }




    public static int[] ordenarInsercionDirecta(int[] array)
    {
        int aux, j;
        for ( int i = 1; i < array.length; i++)
        {
            aux = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > aux)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
        return array;
    }


    public static void mostrarArray(int array[]){
        System.out.print(array[0]);
        for(int i=1;i<array.length;i++){
            System.out.print(","+array[i]);
        }
    }

}

