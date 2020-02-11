public class Principal {

    public static void main(String[] args) {

        System.out.print(max4(50,51,68,100));
    }

    private static int max4(int a, int b, int c, int d){

        int valor1 = (a>b) ? a : b;
        int valor2 = (c>d) ? c : d;

        return (valor1>valor2) ? valor1 : valor2;
    }
}