import java.util.Calendar;

public class Alumno 
{

    private String alias;
    private int anioNac;
    private int edad;

    // NOMBRE COMPLETO
    private String nombre;
    private String ape1;
    private String ape2;

    // CONSTRUCTOR 1
    public Alumno() {

    }
    
    // CONSTRUCTOR 2
    public Alumno(String  alias)        // ERROR DE EDICION
    {
        this(alias,"ape1","ape2");
        this.alias=alias;
    }
    // CONSTRUCTOR 3
    public Alumno(String alias, String ape1, String ape2)
    {
        this.alias = alias;
        this.ape1 = ape1;
        this.ape2 = ape2;
        
    }

     public Alumno(String alias, int anioNAc) 

    {
       this.anioNac = anioNac;
    }
    // ACCESORES


    public String getAlias()

    {
        return alias;
    }
    public String getNombre()

    {
        return nombre;
    }
    public String getApe1()

    {
        return ape1;
    }
    public String getApe2()

    {
        return ape2;
    }
    public int getAnioNac()
    {
        return anioNac;
    }


    public void setAlias(String alias)

    {
        this.alias = alias;
    }
    public void setNombre(String nombre)

    {
        this.nombre = nombre;
    }
    public void setApe1(String ape1){
        this.ape1 = ape1;
    }
    public void setApe2(String ape2){
        this.ape1 = ape2;
    }
    
    // CALCULAR LA EDAD
    public int calcularEdad(int anioNac)
    {
        Calendar fechaActual = Calendar.getInstance();
        assert anioNac < fechaActual.get(Calendar.YEAR) : " La edad no puede ser negativa ";
        int edad = fechaActual.get(Calendar.YEAR) - anioNac;
        return edad;

    }

    public String backAround(String str) {
        return String.valueOf(""+(str.length()-1)+""+str+""+(str.length()-1));
    }



}
