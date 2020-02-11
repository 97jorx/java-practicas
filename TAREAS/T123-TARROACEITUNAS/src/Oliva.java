public class Oliva {

    public static final long BLACK = 0x000000;

    private String nombre;
    private long color = BLACK ;



    public Oliva(String nombre) {
        this.nombre = nombre;
    }

    public Oliva(String nombre, long color) {
        this.nombre = nombre;
        this.color = color;
    }



    @Override
    public String toString() {
        return "Oliva{" +
                "nombre='" + nombre + '\'' +
                ", color=" + color +
                '}';
    }
}
