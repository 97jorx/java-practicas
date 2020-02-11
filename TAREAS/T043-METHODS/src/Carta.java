public class Carta {

    private static final int MENU = 10;
    private static int contador = 0;
    private String plato;                   // No vacio, No nulo, No modificable
    private int id;                         // > 0
    private char calidad;                         // > 0
    private final static String CALIDADES="ABC";
    private Carta carta;

    public Carta (String plato) {
        setPlato(plato);
        setId(++contador);
    }

    private void setId(int id) {
        assert id < MENU : String.format("El id(%d) no puede ser mayor al numero asignado en el menú(%d)", id, MENU);
        this.id = id;
    }

    private void setPlato(String plato){
        assert plato!=null : "Error: el nombre del plato no puede ser nulo";
        assert plato.length()>=1 : "Error: el nombre del plato no puede ser vacio";
        this.plato = plato;
    }


    private void setCalidad(char calidad){
        assert CALIDADES.indexOf(calidad) >=1 : "Error : se debe asignar la calidad del plato";
        this.calidad = calidad;
    }

    @Override
    public boolean equals(Object obj) {
       if( this == obj)
           return true;

       if(obj instanceof Carta) {
           Carta c = (Carta) obj;
           return plato.equals(c.plato);
       } else
           return false;
    }

    public int compareTo(String c) {
        int i = c.compareTo(plato);
        if (i < 0) {
            return i; // PRECEDE
        } else if (i == 0) {
            return i; // SON IGUALES
        } else if (i > 0) {
            return i; //SUCEDE
        }
       return i;
    }


    public String getPlato() {
        return plato;
    }


    public String toString(){
    return
            "\n" + "|"+id+"| "+plato+"  | \n";

    }

}
