
public class Color implements Comparable<Color> {


    private int longOnda;
    private String alias;

    public Color(int longOnda) {
        this.longOnda = longOnda;
    }

    public int getLongOnda() {
        return longOnda;
    }

    public void setLongOnda(int longOnda) {
        this.longOnda = longOnda;
    }

    @Override
    public String toString() {
        return "Colores{" +
                "longOnda=" + longOnda +
                '}';
    }

    @Override
    public int compareTo(Color o) {
        return longOnda-o.longOnda;
    }
}