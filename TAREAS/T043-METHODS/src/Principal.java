public class Principal {
    public static void main(String[] args) {

        Carta c = new Carta("ToRtilLa EspAñolA");
        Carta c1 = new Carta("Patatas revueltas");
        Carta c2 = new Carta("Patatas con huevo");
        Carta c3 = new Carta("Patatas con huevo");

        System.out.println();
        System.out.println(c.compareTo(c1.getPlato()));
        System.out.println(c1.compareTo(c.getPlato()));
        System.out.println(c2.compareTo(c3.getPlato()));

        System.out.println(Util.Mayus(c1.getPlato())); // SE PUEDE LLAMAR CON LA CLASE AL METODO PORQUE SON METODOS ESTÁTICOS

        System.out.println(Util.oracion(c.getPlato()));


        System.out.println("a\b\t\n\r\f");
    }
}
