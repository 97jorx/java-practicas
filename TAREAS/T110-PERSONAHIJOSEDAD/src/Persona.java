public class Persona {

    public final static int NUMATRIBUTOS = 2;
    private static int contador = 1;
    private int numero ;
    private int edad;
    private int numHijos;


    public Persona( ) {
       this.numero = contador++;
    }



    public void setEdad(int edad) {
        assert edad > 0 : "Error : la edad no puede ser menor de 0";
        this.edad = edad;
    }

    public void setNumHijos(int numHijos) {
        assert numHijos > 0 : "Error : la edad no puede ser menor de 0";
        this.numHijos = numHijos;
    }


    public int getEdad() {
        return edad;
    }

    public int getNumHijos() {
        return numHijos;
    }

    @Override
    public String toString() {
        return String.format("[ %s %s ]", (edad == 0 ) ? "" : edad, (numHijos == 0 ) ? "" : numHijos);
    }
}
