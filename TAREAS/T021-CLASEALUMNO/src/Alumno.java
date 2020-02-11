import java.util.Calendar;

public class Alumno
{
    // ---Atributos---
    private String alias;
    // Nombre completo
    private String nombre;
    private String ape1;
    private String ape2;

    private int anioNac;                        // Año de nacimiento


    // ---Construcctores---
    public Alumno(){
        alias="";
        nombre="";
        ape1="";
        ape2="";
        anioNac=0;
    }

    public Alumno(String alias) {
        this.alias=alias;
    }

    public Alumno(String alias, int anioNac) {
        this.alias=alias;
        this.anioNac=anioNac;

    }


    public String getAlias() {
        return alias;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApe1() {
        return ape1;
    }
    public String getApe2() {
        return ape2;
    }
    public int getAnioNac() {
        return anioNac;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }
    public void setApe2(String ape2){
        this.ape2 = ape2;
    }


    public void setAnioNac(int anioNac ){
        this.anioNac = anioNac;
    }


    public void contarPares(int a, int b){
        int numPares = 0;
        for (int i=a; i<=b; i++){
            if(i % 2 == 0)
                numPares++;
        }
    }


    public int edad() {
        Calendar fechaActual = Calendar.getInstance();
        assert anioNac < fechaActual.get(Calendar.YEAR) : " La edad no puede ser negativa ";
        int edad = fechaActual.get(Calendar.YEAR) - anioNac;
        return edad;
    }

    public String nombreCompleto(){
        return "Nombre completo: "+ ape1 +" "+ape2 + ", " + nombre;
    }

    @Override
    public String toString() {
        return ape1+" "+ape2+", "+nombre+" ("+alias+") nacido en el año " + anioNac;
    }
}
