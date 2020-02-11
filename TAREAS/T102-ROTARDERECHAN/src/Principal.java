public class Principal {

    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5,6};
        rotarDerecha(a);
        mostrar(a);
    }

    public static void rotarDerecha(int[] numeros) {
        assert numeros != null : "Error: el array numeros no puede ser nulo";
        assert numeros.length>0 : "Error : el array numeros no puede ser menor de 0";

        int aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 1, j = i - 1; j>=0; i--,j--) {
            numeros[i] = numeros[j];
        }
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
