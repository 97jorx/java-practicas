public class Principal {

    public static void main(String[] args) {

        char[] vocales = new char[] {'a','e','i','o','u'};
        desplazarIzquierda(vocales,3,'-');
        mostrar(vocales);

    }


    private static void desplazarIzquierda(char[] array, int veces, char s) {
        assert array != null : "Error : el array de caracteres no puede ser nulo";
        assert veces > 0 : "Error : el numero de veces tiene que ser mayor de 0";



        int v = array.length - veces;
        char aux = ' ';

        for (int j = 0; j < veces; j++) {
            for (int i = 0; i < array.length - 1; i++)
                array[i] = array[i + 1];
            array[array.length - 1] = s;
        }
    }


    private static void mostrar(char[] array){
        System.out.print(array[0]);
        for (int i = 1; i < array.length ; i++)
            System.out.print(", " + array[i]);
    }
}


