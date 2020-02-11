import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {


        int array[] = {10, 20, 30, 40, 50};
        int array2[] = {660, 250, 230, 560, 10};
        int valorBuscado = 30;
        int result = Arrays.binarySearch(array, valorBuscado);
        if (result < 0)
            System.out.println("No encontrado");
        else
            System.out.println("Encontrado en el indice: " + result);


        Arrays.fill(array,5);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }

}