/**
 * FECHA  : 16/04/2019
 * NOMBRE : JORGE
 * HORA   : 15:42
 */
// Fig. 15.11: ReadSequentialFile.java
// Reading a file of objects sequentially with ObjectInputStream
// and displaying each record.

import java.io.EOFException;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.ObjectInputStream;

public class ReadSequentialFile {



    public static void main(String[] args) {
        // openFile();
        readRecords();

    }

   /* // enable user to select file to open
    public static void openFile() {
        try // open file
        {
            input = new ObjectInputStream(
                    Files.newInputStream(Paths.get("clients.ser")));

        } catch (IOException ioException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }*/


    // read record from file
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");

        try (ObjectInputStream input = new ObjectInputStream(
                Files.newInputStream(Paths.get("clients.ser")))) {

            while(true){
                Account record = (Account) input.readObject();
                // display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch(EOFException endOfFileException) {
            System.err.println("No more record");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Invalid object type. Terminating.");
        } catch (IOException ioException) {
            System.err.println("Error reading from file. Terminating.");
        }
    } // end method readRecords

    // close file and terminate application
}



