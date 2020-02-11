/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 15:48
 */
public class Casa implements Comparable<Casa> {

    private int superficie;


    public Casa(int superficie) {
        setSuperficie(superficie);
    }

    public void setSuperficie(int superficie) {
        assert superficie > 0 : "Error : la superficie tiene que ser mayor de 0";
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "superficie=" + superficie +
                '}';
    }

    @Override
    public int compareTo(Casa o) {
        return superficie-o.superficie;
    }
}
