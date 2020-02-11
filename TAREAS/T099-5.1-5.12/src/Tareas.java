public class Tareas {

    private final static int MAX = 25;
    private static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
      /*  // EJERCICIO 5.1
        double[] precios;
        boolean[] plazasParking;
        String[] nombres;
        int[] diasM;

        // EJERCICIO 5.2
        int n = 0;
        double[] precios2 = new double[20];
        boolean[] plazasParking3 = new boolean[n];
        String[] nombres4 = new String[MAX];
        int[] mesNoviembre =  new int[31];

        //EJERCICIO  5.3

        int[] diasMes = {31,29,31,30,31,30,31,31,30,30,31};
        int numeroElementos = diasMes.length;

        //EJERCICIO  5.4

        int[] enteros = {1,2,3,5,7};
        for (int e:enteros) {
            System.out.print(e);
        }*/

        /*//5.2 ACTIVIDAD
        int[] numeros = new int[20];

        for (int e : numeros)
            e = 10;

        for (int e : numeros)
            System.out.print(e);*/

        //mostrar(array);

        /*System.out.println(nombreDia(1));*/


        int a[] = new int[]{1,2,3,4,5};
        rotarDerecha(a);
        mostrar(a);
        System.out.println();
        rotarDerecha(a);
        mostrar(a);

    }


    //EJERCICIO  5.5
    public static String nombreDia(int numDiaSemana) {
        String[] nombres = {"Lunes", "Martes", "Miércoles", "Jueves",
                "Viernes", "Sabado", "Domingo"};

        return nombres[numDiaSemana - 1];
    }


    //EJERCICIO  5.6
    public double media(double[] notas) {
        assert notas != null : "Error : el array notas no puede ser null";
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
        }

        return media;
    }

    // EJERCICIO 5.7
    public double max(double[] notas) {
        assert notas != null : "Error : el array notas no puede ser null";

        double max = notas[0];
        for (int i = 0; i < notas.length - 1; i++) {
            if (notas[i] > max)
                max = notas[i];
        }

        return max;
    }

    // EJERCICIO 5.8

    private static int contar(int[] array) {
        assert array != null : "Error : el array notas no puede ser null";

        int longitud = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0)
                longitud++;
        }
        return longitud;
    }

    private static int[] pares(int[] numeros) {
        assert numeros != null : "Error: el array de entrada no puede ser nulo";

        if (numeros.length <= 1)
            return numeros;

        int[] pares = new int[contar(numeros)];

        for (int i = 0, j = 0; i < numeros.length - 1; i++)
            if (numeros[i] % 2 == 0) {
                pares[j] = numeros[i];
                j++;
            }
        return pares;
    }

    // EJERCICIO  5.9

    public static void rotarDerecha(int[] numeros) {
        assert numeros != null : "Error: el array numeros no puede ser nulo";

        int aux = numeros[numeros.length - 1];
        for (int i = numeros.length - 1, j = i - 1; j >= 0; i--) {
            numeros[i] = numeros[j];
            j--;
        }
        numeros[0] = aux;
    }

    //EJERCICIO  5.10
    public static int[] generarPares() {
        int[] pares = new int[MAX];

        for (int i = 0; i < pares.length; i++) {
            int r = (int) (Math.random() * 50 + 1);
            if (r % 2 == 0)
                pares[i] = r;
            else
                i--;
        }
        return pares;
    }


    //5.11
    public static int[] frecuencia(int n) {

        int[] array = new int[100];
        int[] frecuencia = new int[100];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            int r = (int) (Math.random() * n);
            array[i] = r;
        }
        for (int j = 0, k = j; j < array.length; j++) {
            if (array[j] == k) {
                contador++;
                k++;
            }
            frecuencia[j] = contador;
        }


        return frecuencia;
    }


    //ACTIVIDAD  5.1
    public static void quince() {
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length - 1; i++) {
            numeros[i] = i;
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            if (i == 15)
                System.out.print(numeros[i]);
        }
    }

    //ACTIVIDAD 5.3
    public static void mostrar(int[] valores) {

        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length - 1; i++)
            System.out.print(valores[i] + ",");
        System.out.print(valores[valores.length - 1]);

    }

    //EJERCICIO 5.4
    public static void mostrar(int[] valores, String s) {

        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length - 1; i++)
            System.out.print(valores[i] + s);
        System.out.print(valores[valores.length - 1]);

    }

}
