public class Principal {

    public static void main(String[] args) {

        System.out.println(masMenos(10));
    }

    private static String masMenos(int n) {

        String texto = "1";
        for (int i=2; i <= n; i++) {

            if (i % 2 == 0)
                texto +=   "+" + i;
            else
                texto = texto +  "-" + i;

        }
        return texto;
    }


}



