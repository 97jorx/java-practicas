public class Principal {

    public static void main(String[] args) {

        System.out.println(suS2('A', 'X', "123 A 123 A 123"));
        //System.out.println(contarDos('A',"HOLAA"));

    }


    /**
     *
     * @param original  Es el caracter que se quiere quitar de la cadena
     * @param nuevo     Es el nuevo caracter se sustituirá por el original
     * @param cadena    Es la cadena a manipular
     * @return          Retorna la cadena ya con el caracter cambiado
     */

    private static String suS2(char original, char nuevo, String cadena) {

        assert cadena != null : "Error:  la cadena no puede ser nula";
        assert !cadena.isEmpty() : "Error: la cadena no puede estar vacia";
        assert original != nuevo : "Error : el caracter a quitar es el mismo que esta en la cadena";


        int contador = 0;

        for (int i = 0; i <= cadena.length() - 1; i++) {
            if (cadena.charAt(i) == original) {
                contador++;
                if (contador == 2)
                    cadena = cadena.substring(0, i) + nuevo + cadena.substring(i+1);
            }
        }
        return cadena;
    }
}
