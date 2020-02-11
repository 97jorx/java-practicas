public class Principal {

    public static void main(String[] args) {
        System.out.print(multiplicar(1,2,3,4));
    }

    public static int multiplicar(int... args) {
        assert args !=null : "Error: los argumentos no pueden ser nulo";
        assert args.length>0 : "Error: los argumentos no pueden ser vacios";
        int total = 1;

        for (int i=0 ; i < args.length ; i++)
            total = args[i]*total;
        return total;
    }
}

