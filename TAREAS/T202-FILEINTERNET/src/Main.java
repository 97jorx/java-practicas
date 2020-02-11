import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * FECHA  : 16/04/2019
 * NOMBRE : JORGE
 * HORA   : 19:49
 */
public class Main {

    private static final String FLOWERS_FEED =
    "https://www.w3schools.com/xml/simple.xml";

    public static void main(String[] args) {

        InputStream stream = null;
        BufferedInputStream buf = null;
        try {
            URL url = new URL(FLOWERS_FEED);
            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            StringBuilder sb = new StringBuilder();

            while(true) {
                int data = buf.read();

                if (data == -1) {
                    break;
                } else {
                    sb.append((char) data);
                }
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
                buf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
