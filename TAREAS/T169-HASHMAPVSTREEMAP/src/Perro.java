import java.util.Objects;

/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 16:53
 */
public class Perro implements Comparable<Perro> {

    private String alias;
    private int talla;

    public Perro(String alias,int talla) {
        setAlias(alias);
        setTalla(talla);
    }

    private void setTalla(int talla) {
        this.talla = talla;
    }


    public void setAlias(String alias) {
        assert alias !=null : "Error : el alias no puede ser nulo";
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;

        if (o instanceof Perro) {
            Perro perro = (Perro) o;
            return o.equals(perro.alias);
        }
        return false;


    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    @Override
    public String toString() {
        return "Perro{" +
                "alias='" + alias + '\'' +
                '}';
    }

    @Override
    public int compareTo(Perro o) {
        System.out.println("COMPARETO");
        return talla-o.talla;
    }
}
