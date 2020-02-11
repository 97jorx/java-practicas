import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FECHA  : 01/04/2019
 * NOMBRE : JORGE
 * HORA   : 12:46
 */
public class Principal {

    //  http://www.docjar.com/html/api/java/lang/Throwable.java.html


    public static void main(String[] args) {

        try {
            throwableTest();
        }catch(Exception e) {
            System.err.println("Cause : "+e.getCause());
            System.err.println("Message : "+e.getMessage());
        }
    }
    public static void throwableTest() throws IOException {
        try {
            int i=4/0;
        } catch(ArithmeticException e) {
            throw new IOException("IOException",e);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}


