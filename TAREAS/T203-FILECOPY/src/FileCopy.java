import java.io.*;

/**
 * FECHA  : 16/04/2019
 * NOMBRE : JORGE
 * HORA   : 20:17
 */
public class FileCopy {


    public static void main(String[] args) {

        if(args.length == 0)
            return;

        try (BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bf2 = new BufferedWriter(new FileWriter(args[1]))) {
            String patron = args[2];
            String linea;
            while ((linea = bf1.readLine()) != null) {
                if (linea.contains(patron) && args.length > 3) {
                    bf2.write(linea);
                    bf2.write("\n");
                } else {
                    bf2.write(linea);
                    bf2.write("\n");
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error no se ha encontrado el fichero " + e);
        } catch (IOException e) {
            System.err.println("Error se ha producido un error de entrada o salida" + e);
        }

    }
}

