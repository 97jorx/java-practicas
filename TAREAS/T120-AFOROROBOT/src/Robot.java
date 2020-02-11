public class Robot {
    private String alias;
    private static int contador;
    private int numero;

    public Robot(String alias) {
        setNumero(contador++);
        setAlias(alias);
    }

    public void setAlias(String alias) {
        assert alias !=null : "Error :el alias no puede ser nulo";
        this.alias = alias;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("Robot [%s,%d]",alias,numero);
    }
}
