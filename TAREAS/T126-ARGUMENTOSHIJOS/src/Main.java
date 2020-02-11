public class Main {

    public static void main(String[] args) {
        assert args != null : "Error : el array args no puede ser nulo";
        assert args.length>0 : "Error : el array args no puede ser menor de 0";
        System.out.println("Introduce el nombre de los hijos : ");

        Persona[] personas = new Persona[args.length];

        for (int j = 0; j < personas.length ; j++) {
            personas[j] = new Persona(args[j]);
        }

        mostrar(personas);
    }



    public static void mostrar(Persona[] personas){
        assert personas != null : "Error : el array personas no puede ser nulo";
        System.out.print(personas[0]);
        for (int i = 1; i <personas.length ; i++) {
            System.out.print(","+personas[i]);
        }
    }


}