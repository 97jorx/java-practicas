/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 13:15
 */
public class Animal implements Comparable<Animal> {

    private String alias;
    private int peso;


    public Animal(String alias,int peso) {
        setAlias(alias);
        setPeso(peso);
    }

    private void setPeso(int peso) {
        assert peso > 0 : "Error : el peso no puede ser menor de 0";
        this.peso = peso;
    }

    public void setAlias(String alias) {
        assert alias != null : "Error : el alias no puede ser nulo";
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "alias='" + alias + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return peso-o.peso;
    }
}
