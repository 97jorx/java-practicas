public class Principal {

    public static void main(String[] args) {

        System.out.println(metodo(5555));
        System.out.println(metodo(-5555));
        System.out.println(metodo(0));

    }


    public static boolean metodo(int x){
        return (x>0) || (x<0);
    }
}
