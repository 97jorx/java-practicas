public class Principal {
    public static void main(String[] args) {

        System.out.println(esVocalIf('U'));
        System.out.println(esVocalSwitch('U'));
        System.out.println(esVocal('U'));
    }

    private static boolean esVocalIf(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
            c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
            c == 'u' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }



    private static boolean esVocalSwitch(char c) {
        boolean correcto = false;
        switch(c) {
            case 'a': case 'e': case 'i': case 'o':
            case 'u': case 'A': case 'E': case 'I':
            case 'O': case 'U':
                      correcto = true; break;
            default:
                return correcto;

        }
        return correcto;
    }

    private static boolean esVocal(char c) {
        return  c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
    }

}
