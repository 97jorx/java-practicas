import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File.*;
/**
 * FECHA  : 10/04/2019
 * NOMBRE : JORGE
 * HORA   : 16:51
 */
public class Principal {
    public static void main(String[] args) {
        try {
            Path path = Paths.get(new URI("file:///G:\\Mi unidad\\PRO-CADENA\\TAREAS\\T193-IMPLEMENTARLECTURADEFICHERO"));
            File file = new File("G:\\Mi unidad\\PRO-CADENA\\TAREAS\\T193-IMPLEMENTARLECTURADEFICHERO\\test.txt");
            Path toPath = file.toPath();
            System.out.println(toPath.equals(path));
        }
        catch (URISyntaxException e) {
            System.out.println("Bad URI");
        }
    }
}
