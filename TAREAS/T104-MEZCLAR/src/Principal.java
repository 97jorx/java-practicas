public class Principal {

    public static void main(String[] args) {

        char[] a1 = new char[]{'P', 'L', 'T'};
        char[] a2 = new char[]{'E', 'O', 'A'};

        char[] a3 = {'1', '2', '3',};
        char[] a4 = {'A', 'B', 'C', 'D', 'E', 'F','G'};

        mostrar(mezclar(a3, a4));


    }

    public static char[] mezclar(char[] a1, char[] a2) {
        assert a1 != null : "Error: el array no puede ser nulo";
        assert a2 != null : "Error: el array no puede ser nulo";
        assert a1.length > 0 : "Error: el array no puede ser 0 o menor";
        assert a2.length > 0 : "Error: el array no puede ser 0 o menor";

        int contador = 0;
        char[] resultado = new char[a1.length + a2.length];
        int longitud = (a1.length > a2.length) ? a1.length : a2.length;

        for (int i = 0; i < longitud; i++) {
            if (i < a1.length)
                resultado[contador++] = a1[i];
            if (i < a2.length)
                resultado[contador++] = a2[i];
        }
        return resultado;


    }


    public static void mostrar(char[] valores) {

        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length - 1; i++)
            System.out.print(valores[i] + ",");
        System.out.print(valores[valores.length - 1]);

    }
}
