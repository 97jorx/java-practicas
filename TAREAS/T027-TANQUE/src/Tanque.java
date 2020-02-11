public class Tanque {
    public static final int MINFILA = 3;
    public static final int MINCOLUMNA = 2;
    public static final int MAXFILA = 6;
    public static final int MAXCOLUMNA = 5;
    private int fila;           // >= MINFILA
    private int columna;        // >= MINCOLUMNA


    public Tanque() {
        fila = (int) (Math.random() * MAXFILA) + MINFILA;
        columna = (int) (Math.random() * MAXCOLUMNA) + MINCOLUMNA;

    }

    public String toString() {
        return "Tanque{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }

}