public class Principal {

    public static void main(String[] args) {
        tripas(5);
    }

    private static void tripas(int n) {

        for (int i = 0; i <= 5; i++) {
            for (int k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }


}


