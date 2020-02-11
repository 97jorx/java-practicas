public class Principal {

    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5};
        mostrar2(a);
    }

    public static void mostrar(int[] valores) {

        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length-1; i++)
            System.out.print(valores[i] + ",");
        System.out.print(valores[valores.length-1]);

    }

    public static void mostrar2(int[] valores) {

        System.out.print(valores[0]);
        for (int i = 1; i < valores.length; i++)
            System.out.print(","+valores[i]);


    }
}
