/**
 * FECHA  : 16/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:36
 */
public class PruebaAutocloseable implements AutoCloseable{

    @Override
    public void close() {
        System.out.println("Soy un close() , segundo");
    }
}
