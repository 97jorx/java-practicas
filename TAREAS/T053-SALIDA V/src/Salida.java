
public class Salida
{
    private Salida() {}
    
    public static void error(String m) {
       System.err.println("Error: "+m);
    }

    public static void log(String m) {
        System.err.println(" Fichero log: "+m);
    }

    public static void mostrar(String m) {
     System.out.print(m);
    }
    
    public static void mostrarL(String m) {
     mostrar("\n"+m);
    }
    
   
}