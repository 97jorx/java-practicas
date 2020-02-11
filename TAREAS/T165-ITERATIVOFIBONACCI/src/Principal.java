import java.util.ArrayList;

/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 16:21
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();

        for (int i = 1; i < 10; i++)
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));



    }


    public static long fib(long n){
        assert n >=0 : "ERROR : el valor de n no puede ser negativo ni 0";
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }

}
