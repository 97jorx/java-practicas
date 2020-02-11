public class Principal {

    public static void main(String[] args) {

        mostrar('A');
        for (int i = 1; i <= 5; i++) {
                mostrar('B');
                mostrar('C');
                mostrar('D');
        }

    }

        private static boolean mostrar(char c){
            System.out.print(c);
            return true;
        }

    }
