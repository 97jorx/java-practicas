public class Principal {
    public static void main(String[] args) {

        String cifrado = "";
        String descifrado = "";
        int clave = 5;
        String palabra = "JORGE";

        //CIFRADO
        for (int i = 0; i < 5; i++)
            cifrado += (char) (palabra.charAt(i) ^ clave);
        System.out.println(cifrado);

        //DESCIFRADO (A ^ B) ^ B = A
        for (int i = 0; i < 5; i++)
            descifrado += (char) (cifrado.charAt(i) ^ clave);
        System.out.println(descifrado);

    }
}
