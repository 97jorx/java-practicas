
//: object/ShowProperties.java
import static java.lang.System.*;

public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        out.print(System.getProperty("user.name"));
        System.out.println(
        System.getProperty("java.library.path"));
}
} ///:~