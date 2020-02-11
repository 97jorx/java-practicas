public class Util {

    private Util(){

    }

    public static String Minus(String p){
        return p.toLowerCase();
    }

    public static String Mayus(String p){
        return p.toUpperCase();
    }

    public static String oracion(String p){
            char a1 = p.charAt(0);
        return Mayus(String.valueOf(a1))+Minus(p.substring(1));
    }
}
