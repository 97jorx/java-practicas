import java.io.*;
import java.util.*;

public class Principal {

    public static void main(String[] args) {

        epropiedades();
        propiedades();

    }

    private static void epropiedades() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("path.separator", "Separacion en una ruta");mapa.put("user.country", "Ciudad del usuario");
        mapa.put("user.dir", "Directorio del usuario");mapa.put("java.runtime.version", "Version runtime  java");
        mapa.put("line.separator", "Linea de separacion");mapa.put("java.vm.specification.vendor", "Especificacion de java");
        mapa.put("os.name", "Nombre sistema operativo");mapa.put("java.library.path", "Ruta de libreria java");
        mapa.put("os.version", "Version sitema operativo");mapa.put("user.home", "Directorio incial del usuario");mapa.put("file.encoding", "Codigicacion de fichero");
        mapa.put("java.specification.version", "Version de especificacion java");mapa.put("user.name", "Nombre de usuario java");
        mapa.put("java.vm.specification.version", "Maquina virtual de java");mapa.put("java.home", "Directorio de java");mapa.put("user.language", "Lenguaje del usuario");
        mapa.put("java.version", "Version de java");mapa.put("java.vendor", "Vendedor de java");mapa.put("file.separator", "Separador de ficheros");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("propiedades.txt"))) {
            List<String> lista = new ArrayList<>();
            for (Map.Entry<String, String> entry : mapa.entrySet()) {
                lista.add(entry.getKey() + "\n" + System.getProperty(entry.getKey()) + "\n" + entry.getValue() + "\n");
            }
            Collections.sort(lista);
            for (String li : lista) {
                bw.write(li);
                bw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void propiedades() {

        try (BufferedReader br = new BufferedReader(new FileReader("propiedades.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}