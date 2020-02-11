public class Principal {

    public static void main(String[] args) {

        System.out.println(contar('A', "ANACARDO", 'C'));
        System.out.println(contar('O',"EDUARDO",'R'));
        System.out.println(contar('T',"PATATA",'A'));
        System.out.println(contar('E',"MELONES",'N'));

  }

    private static int contar(char c, String cadena, char maldito) {
        assert cadena !=null : "Error: la cadena no puede ser nula";

        int contador = 0;
        for (int i = 0; i < cadena.length() ; i++) {

            if(cadena.charAt(i)==maldito)
                break;

            if(cadena.charAt(i)==c)
                contador++;
        }
        return contador;
    }

}
