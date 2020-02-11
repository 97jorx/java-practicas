public class Principal {

    public static void main(String[] args) {

        System.out.println(eN('A',"PARAPETAR"));

    }

    /**
     *
     * @param c     Los caracter a buscar en la cadena
     * @param s     La cadena a la que se recorre para saber si esta el caracter
     * @return      Retorna true si el caracter esta en la cadena
     */

    private static boolean eN(char c, String s) {
        assert s!=null : "Error: la cadena no puede ser nula";
        assert c!=' ' : "Error: el caracter introducido no puede estar vacio";

        boolean correcto = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c)
                correcto=true;
                break;
        }
        return correcto;
    }

}
