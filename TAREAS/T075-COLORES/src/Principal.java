import java.awt.Color;


public class Principal {

    public static final String ANSI_BLACK_BACKGROUND  =  "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND    =  "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND  =  "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND =  "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND   =  "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND =  "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND   =  "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND  =  "\u001B[47m";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        System.out.println("\033[30mEste texto es Negro");
        System.out.println("\033[31mEste texto es Rojo");
        System.out.println("\033[32mEste texto es Verde");
        System.out.println("\033[33mEste texto es Amarillo");
        System.out.println("\033[34mEste texto es Azul");
        System.out.println("\033[35mEste texto es Magenta");
        System.out.println("\033[36mEste texto es Cyan");
        System.out.println("\033[37mEste texto es Blanco");


        Color color1 = new Color(225, 0, 0);
        Color color2 = new Color(0, 255, 0);
        Color color3 = new Color(0, 0, 255);

        System.out.println(ANSI_GREEN_BACKGROUND + "This text has a green background but default text!" + ANSI_RESET);
        System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "This text has a green background and red text!" + ANSI_RESET);
    }
}
