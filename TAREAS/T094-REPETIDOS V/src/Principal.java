public class Principal {

    public static void main(String[] args) {

        System.out.println(repetidos1("PARAPENTE"));
        System.out.println(repetidos2("PARAPETAR"));
        System.out.println(repetidos3("PARAPETAR"));



    }


    // Numero de apariciones de los caracteres que son repetidos

    private static int contar(String s, char c) {
        assert s != null : "Error : la cadena no puede ser nula";
        int contador = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                contador++;
        }
        return contador;
    }

    // Eliminar los caracteres que no son repetidos

    private static String repetidos1(String s) {
        assert s != null : "Error : la cadena no puede ser nula";

        if (s.length() <= 1)
            return s;
        String repetidos = "";

        for (int i = 0; i < s.length(); i++) {
            int contador = contar(s, s.charAt(i));
            if (contador > 1)
                repetidos = repetidos + s.charAt(i);
        }
        return repetidos;
    }



    // Mostrar los caracteres que son repetidos

    private static String repetidos2(String s) {
        assert s != null : "Error : la cadena no puede ser nula";
        if (s.length() <= 1)
            return s;
        String repetidos = "";

        for (int i = 0; i < s.length(); i++)
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && contar(repetidos,s.charAt(i))<1) {
                    repetidos = repetidos + s.charAt(j);
                }
            }
        return repetidos;
    }

    // Eliminar los caracteres que son repetidos

    private static String repetidos3(String s) {
        assert s != null : "Error : la cadena no puede ser nula";

        if (s.length() <= 1)
            return s;
        String repetidos = "";

        for (int i = 0; i < s.length(); i++)
                if (contar(repetidos,s.charAt(i))<1) {
                    repetidos += s.charAt(i);
            }
        return repetidos;
    }

}
