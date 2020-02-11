public class Principal {

    public static void main(String[] args) {

        mostrar(primos(new int[]{2, 4, 6, 8, 10, 11, 12, 13, 17}, new Rango(10, 20)));


    }


    public static int[] primos(int[] a, Rango rango) {
        assert a != null : "Error : el array no puede ser nulo";
        assert rango != null : "Error : el rango no puede ser nulo";

        if(rango.getA()>rango.getB())
            return new int[0];

        int contador = 0;


        for (int i = 0; i < a.length; i++) {
            if (primo(a[i]) && a[i] > rango.getA() && a[i] < rango.getB())
                contador++;
        }

        int[] resultado = new int[contador];

        for (int i = 0, j = 0; i < a.length; i++) {
            if (primo(a[i]) && a[i] > rango.getA() && a[i] < rango.getB()){
                resultado[j] = a[i];
                j++;
            }
        }

        return resultado;

    }


    private static boolean primo(int a) {
        boolean correcto = true;

        for (int i = 2; a % i == 0 && i != a; i++) {
            correcto = false;
        }

        return correcto;
    }


    private static void mostrar(int[] a) {
        System.out.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
    }

}
