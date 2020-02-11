
public class Persona {

    private String alias;
    private Persona progenitor1;
    private Persona progenitor2;
    private Persona conyuge;     // PERSONA SOLO PUEDE TENER UN CONYUGE
    private Persona amigo;      // PERSONA SOLO PUEDE TENER 1 AMIGO
    public static int a = 1;

    public Persona(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias != null : String.format("Error : el alias no puede ser nulo(%s)", alias);
        assert !alias.isEmpty() : String.format("Error : el alias no puede ser vacio (%s)", alias);
        this.alias = alias;
    }


    public void setProgenitor1(Persona progenitor1) {
        assert progenitor1 != progenitor2 || progenitor2 == null : "Error: el progenitor 1 no puede ser igual a progenitor2";
        assert progenitor1 != this.progenitor1 : "Error: el progenitor1 no puede ser uno mísmo";
        this.progenitor1 = progenitor1;
    }

    public void setProgenitor2(Persona progenitor2) {
        assert progenitor2 != this.progenitor2 : "Error: el progenitor2 no puede ser uno mísmo";
        assert progenitor2 != progenitor1 || progenitor1 == null : "Error: el progenitor 1 no puede ser igual a progenitor2";
        this.progenitor2 = progenitor2;
    }


    public void setConyuge(Persona conyuge) {
        assert conyuge != this.conyuge || conyuge == null : "Error : no puede ser conyuge de si mismo";
        this.conyuge = conyuge;
    }

    public void setAmigo(Persona amigo) {
        assert amigo != this.amigo || amigo == null : "Error : no puedes ser amigo de si mismo";
        this.amigo = amigo;
    }

    public Boolean estaCasada() {
        return conyuge != null;
    }


    @Override
    public String toString() {
        return "Alias(" + alias + ")\n-->" + "Progenitor1: (" + String.valueOf((progenitor1 == null) ? " " : progenitor1.alias) + ")" +
                "\n-->" + "Progenitor2: (" + String.valueOf((progenitor2 == null) ? " " : progenitor2.alias) + ")" +
                "\n-->Conyuge: (" + String.valueOf((conyuge == null) ? " " : conyuge.alias) + ")" +
                "\n-->Amigo: (" + String.valueOf((amigo == null) ? " " : conyuge.alias) + ")";
    }
}
