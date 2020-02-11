import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Inicio de main en Principal");

        OlivaJar o1 =  new OlivaJar(3,"CHUPADEDO");

        System.out.print(o1.getOlivas()[0]);
        for (int i = 1; i < o1.getOlivas().length ; i++) {
            System.out.print(", "+o1.getOlivas()[i]);
        }




    }
}
