/**
 * FECHA  : 16/04/2019
 * NOMBRE : JORGE
 * HORA   : 15:28
 */
// Fig. 15.10: CreateSequentialFile.java
// Writing objects sequentially to a file with class ObjectOutputStream.

import java.awt.geom.IllegalPathStateException;
import java.io.IOException;

import java.io.InvalidClassException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.ObjectOutputStream;

public class CreateSequentialFile {

    /*private static ObjectOutputStream output; // outputs data to file*/

    public static void main(String[] args) {
        //openFile();
        addRecords();
       // closeFile();
    }

   /* // open file clients.ser
    public static void openFile() {
        try {
            output = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("clients.txt")));

        } catch (IllegalArgumentException e) {  // (1)
            System.err.println("Error contains an invalid combination of options. Terminating");
            System.exit(1); // terminate the program
        } catch (SecurityException e) {  // (1)
            System.err.println("Error security violation");
            System.exit(1); // terminate the program
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }*/

    // add records to file
    public static void addRecords() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        while (input.hasNext()) // loop until end-of-file indicator
        {
            try (ObjectOutputStream output = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("clients.txt")))){
                // create new record; this example assumes valid input
                Account record = new Account(input.nextInt(),
                        input.next(), input.next(), input.nextDouble());

                output.writeObject(record);

            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            } catch (InvalidClassException elementException) { // (3)
                System.err.println("Something is wrong with a class used by serialization.");
                input.nextLine(); // discard input so user can try again     InvalidClassException
            } catch (IOException ioException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            }


            System.out.print("? ");

        }
    }
/*
    // close file and terminate application
    public static void closeFile() {
        try {
            if (output != null)
                output.close();
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
        }
    }*/
} // end class CreateSequentialFile
