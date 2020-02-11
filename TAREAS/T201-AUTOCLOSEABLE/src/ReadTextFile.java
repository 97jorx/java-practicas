// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.

import java.awt.geom.IllegalPathStateException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {


    public static void main(String[] args) {
        readRecords();
    }

    // read record from file
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
        try (PruebaAutocloseable pa = new PruebaAutocloseable();
            Scanner input = new Scanner(Paths.get("clients.txt"))) {
            System.out.println("Primero");
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
            System.out.println("Error : se ha producido un error de runtime");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}