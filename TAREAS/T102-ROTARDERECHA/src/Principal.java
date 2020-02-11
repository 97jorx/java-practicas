public class Principal {

    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5,6};
        rotarDerecha(a,2);
        mostrar(a);
    }

    public static void rotarDerecha(int[] numeros,int n) {
        assert numeros != null : "Error: el array numeros no puede ser nulo";
        assert numeros.length>0 : "Error : el array numeros no puede ser menor de 0";

        for (int i = 0; i <= n; i++) {
          rotarDerecha(numeros);
        }

    }


    public static void rotarDerecha(int[] numeros) {
        assert numeros != null : "Error: el array numeros no puede ser nulo";
        assert numeros.length>0 : "Error : el array numeros no puede ser menor de 0";


            int aux = numeros[numeros.length - 1];
            for (int i = numeros.length - 1; i>0; i--)
                numeros[i] = numeros[i-1];
            numeros[0] = aux;


    }

    public static void mostrar(int[] valores) {

        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length-1; i++)
            System.out.print(valores[i] + ",");
        System.out.print(valores[valores.length-1]);

    }
}
