public class Principal {

    public static void main(String[] args) {
        a();
        d();
    }

    private static void d() {
        System.out.println("Hola soy un metodo incognito");
    }

    private static void a(){
        System.out.println(b(3));
    }

    private static int b(int numero){
       return c(--numero);
    }

    private static int c(int numero){
        return --numero;
    }


}
