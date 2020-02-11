public class Militar {
    private String  alias;
    private Rango rango;
    private int estrellas=0;

    public Militar(String alias, Rango rango) {
        setAlias(alias);
        setRango(rango);
    }

    public void setAlias(String alias) {
        assert alias !=null : "Error : el tipo rango no puede ser nulo";
        this.alias = alias;
    }

    public void setEstrellas(int estrellas) {
        assert estrellas >0 : "Error : el numero de estrellas tiene que ser 0 o más";
        this.estrellas = estrellas;
    }

    public void setRango(Rango rango){
        assert rango !=null : "Error : el tipo rango no puede ser nulo";
        this.rango=rango;
    }


    public Rango getRango() {
        return rango;
    }

    public boolean equals(Object obj) {
        if ( obj == null ) return false;

        if ( obj instanceof Militar ) {
            Militar m = (Militar) obj;
            return rango.getTipoRango().equals(m.rango.getTipoRango());
        }
        return false;
    }

    public int compareTo(Militar o){
        return rango.compareTo(o.rango);
    }



    @Override
    public String toString() {
        return "Militar{" +
                "alias='" + alias + '\'' +
                ", rango=" + rango +
                ", estrellas=" + estrellas +
                '}';
    }

}
