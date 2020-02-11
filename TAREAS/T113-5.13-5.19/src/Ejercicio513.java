public class Ejercicio513 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};


        mostrar(buscarLineal2(numeros, 3));
    }

    private static int[] buscarLineal2(int[] numeros, int valorBuscado) {
        assert numeros != null : "Error : el valor a buscar dentro de el array no puede ser nulo";
        assert numeros.length > 0 : "Error: la longitud del array no puede ser 0";

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado)
                contador++;
        }

        int[] posicion = new int[contador];

        for (int j = 0, a = 0; j < numeros.length; j++)
            if (numeros[j] == valorBuscado) {
                posicion[a] = j;
                a++;
            }
        return posicion;
    }


    private static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length-1; i++)
            System.out.print(numeros[i] + " ,");
        System.out.print(numeros[numeros.length-1]);
    }
}