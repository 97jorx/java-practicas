/**
 * FECHA  : 19/04/2019
 * NOMBRE : JORGE
 * HORA   : 20:06
 */
import java.io.Serializable;
import java.util.Objects;

/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 16:53
 */
public class Animal implements Serializable,Comparable<Animal> {

    private String alias;
    private int peso;

    public Animal(String alias,int peso) {
        setAlias(alias);
        setPeso(peso);
    }

    private void setPeso(int peso) {
        if (peso<=0)
            throw new IllegalArgumentException("Error el peso no puede ser menos o igual que 0");
        this.peso = peso;
    }


    public void setAlias(String alias) throws NullPointerException {
        if (alias == null)
            throw new NullPointerException("Error : el alias no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("Error : el alias no puede ser vacio");
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;

        if (o instanceof Animal) {
            Animal perro = (Animal) o;
            return o.equals(perro.alias);
        }
        return false;


    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }



    @Override
    public int compareTo(Animal o) {
        System.out.println("COMPARETO");
        return peso-o.peso;
    }

    @Override
    public String toString() {
        return String.format("Alias: %-6s Peso: %-6s",alias,peso);
    }
}

