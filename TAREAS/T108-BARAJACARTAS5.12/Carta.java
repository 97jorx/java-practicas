public class Carta {

    String nombre;
    TipoPalo palo; // NN

    public Carta (String nombre, TipoPalo palo){
        setPalo(palo);
        setNombre(nombre);
    }


    public void setPalo(TipoPalo palo) {
        assert palo!=null: "Error : El palo de la carta no puede ser nulo.";
        this.palo = palo;
    }


    public void setNombre(String nombre) {
        assert nombre!=null: "Error : el nombre de la carta no puede ser nulo.";
        this.nombre = nombre;
    }



    public String toString() {
        return "Carta[" + nombre + " de " + palo + "]\n";
    }

}