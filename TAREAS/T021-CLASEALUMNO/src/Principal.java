public class Principal {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Cadena", 1997);

        a1.setApe1("Cadena");
        a1.setApe2("Casado");
        a1.setNombre("Jorge");
        a1.setAnioNac(1997);


        System.out.println("\n"+a1.nombreCompleto());
        a1.edad();

        System.out.println(a1);
        System.out.println(a1.edad());

        Instituto i1 = new Instituto();
        System.out.println(i1.crearAlumno().nombreCompleto());


    }
}
