/**

 * Esta clase define como contar un caracter de una cadena evitando el caracter maldito

 * @author Jorge

 * @version 20/05/2019/A

 */
public class Principal {



    public static void main(String[] args) {

        System.out.println(contar('A', "ANACARDAAO", 'C'));
    }



    /**

     * Método contar caracteres sin el maldito sobre una cadena.

     * @param c Caracter a contar.
     * @param cadena Cadena a contar dichos caracteres.
     * @param maldito Caracter maldito que no se va a contar.
     * @return Devuelve el numero de apariciones en la cadena del caracter c.

     */

    private static int contar(char c, String cadena, char maldito) {

        int contador = 0;
        for (int i = 0; i < cadena.length() ; i++) {
            if(cadena.charAt(i)==maldito)
                for (int j = i; j < cadena.length() ; j++) {
                    if (cadena.charAt(j) == c)
                        contador++;
                }
        }
        return contador;
    }

}
