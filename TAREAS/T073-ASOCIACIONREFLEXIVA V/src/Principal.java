public class Principal {

    public static void main(String[] args) {

        Persona padre = new Persona("Pepito");
        Persona madre = new Persona("Maria");
        Persona amigo = new Persona("Jorgito");

        Persona hijo2 = new Persona("Juanita");

        hijo2.setProgenitor1(padre);
        hijo2.setProgenitor2(madre);
        madre.setConyuge(padre);
        hijo2.setAmigo(amigo);
        System.out.println(hijo2);




    }
}
