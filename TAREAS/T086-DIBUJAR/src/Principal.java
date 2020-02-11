public class Principal {
    public static void main(String[] args) {

        dibujar("PARALELOGRAMO", '*');
        System.out.println();
        dibujar("CUADRADO", '*');
        System.out.println();
        dibujar("RECTANGULO", '*');
        System.out.println();
        dibujar("TRIANGULO", '*');
        System.out.println();
        dibujar("ROMBO", '*');
        System.out.println();
        dibujar("TRAPECIO", '*');

    }

    private static void dibujar(String s, char c) {

        switch (s) {

            case "PARALELOGRAMO":
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 5; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case "CUADRADO":

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;

            case "RECTANGULO":

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;

            case "TRIANGULO":
                for (int i = 0; i <= 5; i++) {
                    for (int k = i; k <= 5; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case "CIRCULO":
            case "OVALO":

            case "ROMBO":
                for (int i = 0; i <= 5; i++) {
                    for (int k = i; k <= 5; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                for (int i = 5; i > 0; i--) {
                    for (int k = i; k <= 5; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case "TRAPECIO":
                for (int i = 6; i > 0; i--) {
                    for (int k = i; k <= 6; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        if (i == 2 || i == 1)
                            break;
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                break;
            default:
                assert false : "Error : figura erronea";
        }

    }
}
