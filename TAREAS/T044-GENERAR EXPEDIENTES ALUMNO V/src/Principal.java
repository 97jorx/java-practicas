public class Principal {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Cadena");
        Alumno a2 = new Alumno("Ca");
        Alumno a3 = new Alumno("Ca");

        a1.setApe1("Cadena");
        a1.setApe2("Casado");
        a1.setNombre("Jorge");
        a1.setAnioNac(1997);


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        int c = 3;
        /*System.out.println(--c);*/
        System.out.println(c--);

    }
}
