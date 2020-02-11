public class Main {

    public static void main(String[] args) {
        Militar m1 = new Militar("PEPITO",  new Rango(TipoRango.GENERALDEBRIGADA) );
        Militar m2 = new Militar("JUANITO", new Rango(TipoRango.GENERAL) );
        Militar m3 = new Militar("JORGITO", new Rango(TipoRango.GENERAL) );

        System.out.println(m1.equals(m2));
        System.out.println(m2.equals(m3));
        System.out.println(m3.compareTo(m2));

    }
}
