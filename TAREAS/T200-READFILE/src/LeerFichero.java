import java.io.*;

/**
 * FECHA  : 16/04/2019
 * NOMBRE : JORGE
 * HORA   : 17:10
 */
public class LeerFichero {

    public static void main(String[] args) {

        try ( BufferedReader bf = new BufferedReader(new FileReader("fichero.txt"))) {
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error no se ha encontrado el fichero " + e);
        } catch (IOException e) {
            System.err.println("Error se ha producido un error de entrada o salida"+ e);
        }

    }

}

