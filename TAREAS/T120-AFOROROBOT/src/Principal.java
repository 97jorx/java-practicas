public class Principal {
    public static void main(String[] args) {
        Tablero t1 = new Tablero(3);

        Robot r1 = new Robot("A1");
        t1.colocar(r1);

        Robot r2 = new Robot("A2");
        t1.colocar(r2);

        Robot r3 = new Robot("A3");
        t1.colocar(r3);

        System.out.print(t1);
        t1.mostrar();



    }
}
