public class Principal {

    public static void main(String[] args) {

        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void m1() throws IllegalStateException {

        try {
            m2();
        } catch ( IllegalArgumentException e) {
            throw new IllegalStateException("Hola", e);
        }


    }

    public static void m2() throws IllegalArgumentException {

        try {
            m3();
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("me llamo", e);
        }

    }

    public static void m3() throws ArithmeticException {
        throw new ArithmeticException("Jorge");

    }

}
