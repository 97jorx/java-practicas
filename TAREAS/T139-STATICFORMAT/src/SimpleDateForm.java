import java.util.*;
import java.text.*;

public class SimpleDateForm {

    private static String name = "Hola";

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yy");
        Date d = sdf1.parse("12-04-1968 11:23:45");
        String s = sdf2.format(d);
        System.out.println(s);

        System.out.println("Hello".format(name));


    }
}
