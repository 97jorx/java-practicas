import java.io.*;

public class ShowStack {
    public static void main(String[] args) throws IOException {
        ShowStack ss = new ShowStack();
    }

    public ShowStack() throws IOException {
        initialize();
    }

    protected void initialize() throws IOException {
        readFileData();
    }

    protected void readFileData() throws IOException {
        try {
            File f = new File("test.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null)   {
                System.out.println (line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error : no se ha encontrado el archivo de texto");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}