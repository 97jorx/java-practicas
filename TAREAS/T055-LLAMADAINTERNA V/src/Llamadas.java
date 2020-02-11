public class Llamadas {
    public static void main(String[] args) {

        mostrar(); // NO ESTATICO EN UN CONEXTO ESTÁTICO
        mostrar("hola");

    }

    public  void mostrar(){
        System.out.println("hola");
        mostrar("Adios");// ESTÁTICO EN UN CONTEXTO NO ESTÁTICO
    }

    public static void mostrar(String s){
        System.out.println(s);
    }
}
