public class Principal  {
    public static void main(String[] args) {
        String[] array = {"a","c","d","e","b","z"};
        mostrarArray(ordenarInsercionDirecta(array));
    }


    public static String[] ordenarInsercionDirecta(String[] array)
    {
        String aux;
        int j;
        for ( int i = 1; i < array.length; i++)
        {
            aux = array[i];
            j = i - 1;

            while (j >= 0 && array[j].compareTo(aux)>0)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
        return array;
    }


    public static void mostrarArray(String[] array){
        System.out.print(array[0]);
        for(int i=1;i<array.length;i++){
            System.out.print(","+array[i]);
        }
    }

}

