import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        int[] array = {1,2,9,1,500,5,6,7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,5));
    }
}
