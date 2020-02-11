public class Principal {

    public static void main(String[] args) {
        char[] c = {'A', 'B', 'C', 'D', 'E','Ñ'};
        System.out.print(buscarDicotomica(c, 'Ñ'));
    }

    public static boolean buscarDicotomica(char[] c, char valorBuscado) {
        assert c!=null : "Error : el array de caracteres no puede ser nulo";

        boolean encontrado = false;
        int izquierda = 0;
        int derecha = (c.length - 1);
        int mitad = 0;

        while (izquierda <= derecha && !encontrado) {
            mitad = (izquierda + derecha) / 2;

            if (c[mitad] == valorBuscado)
                encontrado = true;
            else if (c[mitad] > valorBuscado)
                derecha = mitad - 1;
            else
                izquierda = mitad + 1;
        }
        return encontrado;
    }


}


