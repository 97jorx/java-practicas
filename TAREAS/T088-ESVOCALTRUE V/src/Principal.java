public class Principal {
    public static void main(String[] args) {

        System.out.println(contar("MURCIELAGO"));
        System.out.println(contar("MURCIANO"));
        System.out.println(contar("CONSIGUIERAS"));

    }


    /**
     * @param cadena      La cadena a la que se cuentan los caracteres
     * @return      Retorna true o false si estan todas las vocales
     */

    private static boolean contar(String cadena) {
        assert cadena != null : "Error: la cadena no puede ser nula";
        assert !cadena.isEmpty() : "Error : la cadena de caracteres no puede estar vacia ";

        String caracteres = "AEIOU";
        boolean resultado = false;

        int contador = 0;

        for (int i = 0; i < caracteres.length(); i++)
            for (int j = 0; j < cadena.length(); j++) {
                if (caracteres.charAt(i) == cadena.charAt(j)) {
                    contador++;
                }

                if (contador == 5)
                    resultado = true;
            }
        return resultado;
    }

}

