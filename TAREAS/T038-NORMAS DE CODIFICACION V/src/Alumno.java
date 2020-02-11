public class Alumno {

    // https://trello.com/c/rW7JvvWz/116-normas-de-estilo-de-codificacion

    // ---Atributos---
    private String alias;

    // Nombre completo
    private String nombre;
    private String ape1;
    private String ape2;

    private int anioNac;             // Año de nacimiento

    // ---Constructores---
    public Alumno()
    {
        alias="";
        nombre="";
        ape1="";
        ape2="";
        anioNac=0;

    }

    public Alumno(String alias)
    {
        this.alias=alias;
    }

    public Alumno(String alias, int anioNac)
    {
        this.alias=alias;
        this.anioNac=anioNac;
    }

    // ---Método---
    public String toString()
    {
        return ape1+" "+ape2+", "+nombre+" ("+alias+") nacido en el año "+anioNac;
    }

}
