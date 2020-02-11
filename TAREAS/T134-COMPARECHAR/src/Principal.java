import java.text.Collator;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        Collator e = Collator.getInstance(new Locale("es", "ES"));

        System.out.println((char)e.compare("a","A"));
        System.out.println(e.compare(String.valueOf('a'),String.valueOf('á')));
        System.out.println((char)"a".compareTo("á"));

    }

}
