import java.util.Objects;

/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 16:53
 */
public class Alumno implements Comparable<Alumno> {

    private String alias;
    private int peso;

    public Alumno(String alias, int peso) {
        try {
            setAlias(alias);
            setPeso(peso);
        } catch (NullPointerException e) {
            System.err.println(e);
        } catch (NombreVacioException e) {
            System.err.println(e);
        } catch (NoNegativoException e) {
            System.err.println(e);
        }
    }


    private void setPeso(int peso) throws NoNegativoException {
        if (peso < 0)
            throw new NoNegativoException("Error : el peso no puede ser negativo");
        this.peso = peso;
    }


    private void setAlias(String alias)  {
        if (alias == null)
            throw new NullPointerException("Error : el alias no puede ser nulo");
        if (alias.isEmpty())
            throw new NombreVacioException("Error : el nombre no puede ser vacio");
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;

        if (o instanceof Alumno) {
            Alumno alumno = (Alumno) o;
            return o.equals(alumno.alias);
        }
        return false;


    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    @Override
    public int compareTo(Alumno o) {
        System.out.println("COMPARETO");
        return peso - o.peso;
    }

    @Override
    public String toString() {
        return "Alumno: " +
                "alias='" + alias + '\'' +
                ", peso=" + peso;
    }
}
