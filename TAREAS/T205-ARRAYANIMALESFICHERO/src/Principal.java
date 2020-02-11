import java.io.*;

/**
 * FECHA  : 19/04/2019
 * NOMBRE : JORGE
 * HORA   : 20:04
 */
public class Principal {

    public static void main(String[] args) {


        Animal[] animals = new Animal[]{
                new Animal("Pollo", 4),
                new Animal("Gato", 5),
                new Animal("Aguila", 6),
                new Animal("Cerdo", 100)};


        try {

            FileOutputStream fileOutputStream = new FileOutputStream("animales.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("animales.txt"));


            for (int i = 0; i < animals.length; i++) {
                objectOutputStream.writeObject(animals[i]);
                System.out.println(objectInputStream.readObject());
            }

            objectOutputStream.close();



        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

