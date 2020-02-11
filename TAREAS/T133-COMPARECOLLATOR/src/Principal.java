import java.text.Collator;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        Collator esp = Collator.getInstance( new Locale( "es", "ES" ) );
        int result = esp.compare("HOLA","PEDRO");
        int result2 = "A".compareTo("B");

        System.out.printf("%s,%s",result,result2);
        // realizará la comparación en base al orden alfabeto español (y no de Unicode).
    }
}
