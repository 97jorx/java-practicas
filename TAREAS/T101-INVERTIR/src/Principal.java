public class Principal {
    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5};
        mostrar(a);
        System.out.println();
        invertir(a);
        mostrar(a);



    }

    private static void invertir(int[] array){
        assert array!=null : "Error : el array no puede ser nula";

        if(array.length == 0)
            return;

        int aux = 0;

        for(int i = 0, j = array.length-1; i<j; i++,j--){
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }

    }


    public static void mostrar(int[] array){
        assert array!=null : "Error : el array no debe de ser nulo";

        if(array.length == 0)
            return;

        System.out.print(array[0]);
        for (int i = 1; i <array.length ; i++) {
            System.out.print("," + array[i]);
        }
    }
}
