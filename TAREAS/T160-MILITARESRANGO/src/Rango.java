public class Rango {

    private TipoRango tipoRango;

    public Rango( TipoRango tipoRango) {
        setTipoRango(tipoRango);
    }


    public void setTipoRango(TipoRango tipoRango) {
        assert tipoRango !=null : "Error : el tipo rango no puede ser nulo";
        this.tipoRango = tipoRango;
    }

    public TipoRango getTipoRango() {
        return tipoRango;
    }

    public int compareTo(Rango o){
        return tipoRango.compareTo(o.tipoRango);
    }

    @Override
    public String toString() {
        return "Rango{" +
                "tipoRango=" + tipoRango +
                '}';
    }
}
