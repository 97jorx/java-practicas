/**
 * Ejer. 7.2. Crear un ejemplo donde un coche contenga 4 ruedas (objetos). Implementar el método
 * clone() usando la interface Cloneable en la clase Coche realizando una copia profunda (“deep
 * copy”)
 */
public class Main {
    public static void main(String[] args) {
        Rueda r1 = new Rueda(4);
        Coche co1 = new Coche(180, r1);
        Coche co2 = (Coche) co1.clone();

        co1.setRueda(new Rueda (2) );
        co1.setVelocidad(110);
        System.out.print(co1+ "  " + co2);
    }

}
