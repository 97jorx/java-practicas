// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.

import java.awt.geom.IllegalPathStateException;
import java.io.*;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();

    }

    // open file clients.txt
    public static void openFile() {
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IllegalPathStateException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    // read record from file
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
        try {
            while (input.hasNext()) // while there is more to read
            {
                // display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        } catch (RuntimeException elementException) {
            elementException.printStackTrace();
        } finally {
            try {
                if(input != null)
                    input.close();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }

        }
    }

}
