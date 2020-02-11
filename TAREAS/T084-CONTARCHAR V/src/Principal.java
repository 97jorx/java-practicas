public class Principal {
    public static void main(String[] args) {

        System.out.println(contar("AEIOU", "PROGRAMACION EN JAVA"));

    }


    /**
     *
     * @param s Cadena de caracteres.
     * @return Devuelve el contador si el contador es  1 o más es que en la cadena hay 1 caracter repetido o más.
     */

    private static int contarChar(String s) {
        assert s != null : "Error : la cadena no puede ser nula";
        int contador = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    contador++;
            }
        }
        return contador;
    }

    /**
     *
     * @param caracteres  Los caracteres que se buscan en la cadena
     * @param cadena      La cadena a la que se cuentan los caracteres
     * @return      Retorna el contador que es el numero total de apariciones de los caracteres
     */

    private static int contar(String caracteres, String cadena) {
        assert caracteres!=null : "Error: la cadena de caracteres no puede ser nula";
        assert cadena!=null : "Error: la cadena no puede ser nula";
        assert !caracteres.isEmpty() : "Error : la cadena de caracteres no puede estar vacia ";
        assert !cadena.isEmpty() : "Error : la cadena de caracteres no puede estar vacia ";
        assert contarChar(caracteres) < 1 : String.format("Error : no pueden ser carecteres repetidos la cadena de los " +
                "caracteres %s",caracteres);


        int contador = 0;
        for (int i = 0; i < caracteres.length(); i++) {
            for (int j = 0; j < cadena.length(); j++) {
                if (caracteres.charAt(i) == cadena.charAt(j))
                    contador++;
            }
        }
        return contador;
    }

}

