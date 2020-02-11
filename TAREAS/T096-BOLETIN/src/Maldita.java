public class Maldita {

    public static void main(String[] args) {
        System.out.println(contar("casa", "La casa rosa estaba al lado de la casa azul y detrás de la casa morada", "azul"));
    }

    private static int contar(String subcadena, String s, String maldita) {

        int contador = 0;
        for (int i = 0; i < s.length() ; i++) {

            String trozomaldita= s.substring(i,i+subcadena.length());
            String trozo = s.substring(i,i+subcadena.length());

            if(trozomaldita.equals(maldita))
                break;

            if(trozo.equals(subcadena))
                contador++;

        }

        return contador;
    }


}
