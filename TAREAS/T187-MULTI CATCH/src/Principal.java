/**
 * FECHA  : 03/04/2019
 * NOMBRE : JORGE
 * HORA   : 13:10
 */
public class Principal {

    public static void main(String[] args) {

        try {
            int[] a = new int[5];
            a[6] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.err.println("Error : error al divir entre 0"+e);
        } catch (Exception e) {
            System.out.println("Error : excepcion pariente de Exception");
        }

    }
}


