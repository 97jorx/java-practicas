import java.util.HashMap;
import java.util.Map;

public class Pricipal {

    public static void main(String[] args) {




        for (Map.Entry entrada : a.entrySet()) {
            System.out.println("!" + entrada.getKey() + " = " + entrada.getValue());
        }

    }


    public static int factorial(int valor){
        assert valor !=null : "ERROR : el valor de n no puede ser negativo ni 0";

        HashMap<Integer,Integer> a = new HashMap<>();
        int aux = valor;
        valor = 0;

        a.put(valor,factorial());

        if(valor==1)
            return 1;

        return aux = valor * factorial(valor-1);
    }
}
