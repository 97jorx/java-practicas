public class Main {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 6, 8, 10};
        int[] b = {0, 1, 2, 4, 6, 8, 10, 12};
        System.out.println(buscarDicotomica(b, 4));
        System.out.println(buscarDicotomica(b, 8));
        System.out.println(buscarDicotomica(b, 12));

        System.out.println(buscarDicotomica(a, 4));
        System.out.println(buscarDicotomica(a, 8));
        System.out.println(buscarDicotomica(a, 12));
    }

    public static boolean buscarDicotomica(int[] numeros, int valorBuscado) {
        assert numeros != null : "Error: el array no puede ser nulo";
        assert numeros.length > 0 : "Error: el array no puede ser vacio";

        boolean encontrado = false;
        int izquierda = 0;
        int derecha = numeros.length - 1;
        int mitad = 0;


        while (izquierda <= derecha && !encontrado) {

            mitad = (izquierda + derecha) / 2;
            if (numeros[mitad] == valorBuscado)
                encontrado = true;
            else if (numeros[mitad] > valorBuscado)
                derecha = mitad - 1;
            else
                izquierda = mitad + 1;
        }

        return encontrado;
    }
}
