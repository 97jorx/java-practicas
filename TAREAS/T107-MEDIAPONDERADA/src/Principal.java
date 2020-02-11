public class Principal {

    public static void main(String[] args) {

        double[] array = new double[]{6.4, 9.2, 8.1};
        double[] pesos = new double[]{0.3, 0.2, 0.5};

        System.out.println(mediaPonderada(array, pesos));
    }

    private static double mediaPonderada(double[] array, double[] pesos) {
        assert array != null : "Error : el array no puede ser nulo";
        assert pesos != null : "Error : el array de pesoso no puede ser nulo";
        assert array.length == pesos.length : "Error : el peso del array ";

        double media = 0;
        double sumPesos = 0;

        for (int i = 0; i < pesos.length; i++) {
            sumPesos += pesos[i];
        }

        for (int i = 0; i < array.length ; i++) {
            media += array[i] * pesos[i];
        }
        return media;
    }


}
