import java.util.ArrayList;
import java.util.List;

/**
 * FECHA  : 10/03/2019
 * NOMBRE : JORGE
 * HORA   : 18:32
 *
 * Actividad 6.1 Analizar y probar el código del ejemplo anterior (Ejemplo 4). ¿Qué tipo de
 * conversión automática se da en los casos (1) y (2)?
 */
public class Act61 {

    public static void main(String[] args) {
        Integer i = -8; // (1)      AUTOBOXING
        // Unboxing en paso de parámetros

        int va = valorAbsoluto(i);
        System.out.println("valor absoluto de " + i + " = " + va);
        List<Double> ld = new ArrayList<>();
        ld.add(Math.PI); // (2)     AUTOBOXING

        // Unboxing en asignación
        double pi = ld.get(0);
        System.out.println("pi = " + pi);
    }

    public static int valorAbsoluto(int i) {
        return (i < 0) ? -i : i;
    }



}
