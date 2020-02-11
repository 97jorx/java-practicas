public class Principal2 {

    public static void main(String[] args) {

        char[] a1 = new char[]{'P', 'L', 'T'};
        char[] a2 = new char[]{'E', 'O', 'A'};

        char[] a3 = {'1', '2', '3', '4', '5'};
        char[] a4 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        mostrar(mezclar(a3, a4));


    }

    public static char[] mezclar(char[] a1, char[] a2) {
        assert a1 != null : "Error: el array no puede ser nulo";
        assert a2 != null : "Error: el array no puede ser nulo";
        assert a1.length > 0 : "Error: el array no puede ser 0 o menor";
        assert a2.length > 0 : "Error: el array no puede ser 0 o menor";


        int longitud = a1.length + a2.length;
        char[] resultado = new char[longitud];
        char[] corto;
        char[] largo;


       /* for (int i = 0; i < resultado.length; i++)
            resultado[i] = ' ';

        if (a1.length <= a2.length) {
            corto = a1;
            largo = a2;
        } else {
            corto = a2;
            largo = a1;
        }


        for (int j = 0, i = j; j < corto.length + i; j += 2, i++) {
            resultado[j] = corto[i];
        }

        for (int j = 0, i = 0; j < resultado.length; j++) {
            if (resultado[j] == ' ') {
                resultado[j] = largo[i];
                i++;
            }
        }*/


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
