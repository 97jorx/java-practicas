public class Persona {

    private String alias;


    public Persona(String alias) {
        setAlias(alias);
    }

    public void setAlias(String alias) {
        assert alias !=null : "Error : el alias no puede ser distinto de null";
        assert !alias.isEmpty() : "Error : el alias no puede ser vacio";
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return String.valueOf(alias);
    }
}
