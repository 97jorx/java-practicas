 /**
 * 
 * 
CREAR UNA CLASE INSTITUTO CON UN METODO QUE CREE VARIOS OBJETOS ALUMNOS.

PROBAR LOS ACCESORES Y MUTADORES MOSTRANDO ALUMNOS POR PANTALLA

COMPROBAR QUE SE CONTROLA LA RESTRICCION ESPECIFICADA PARA EL ATRIBUTO ANIONAC

¿QUE OCURRE SI CAMBIO LA VISIBILIDAD DE UN CONSTRUCTOR DE LA CLASE ALUMNO A 
PRIVADA E INTENTO CREAR UN OBJETO ALUMNO USANDO ESE CONSTRUCTOR?

SEGUIR LAS NORMAS DE ESTILO DE CODIFICACION
NORMAS DE ESTILO DE CODIFICACION

 */

import java.util.Calendar;


public class Instituto {
    public static void main(String[] args) {
        
    
        
    Alumno a3 = new Alumno("Nestor","Tilla","Agudada");
    
   System.out.println( " El nombre completo es : " + a3.getNombre() + a3.getApe1() + a3.getApe2());
    
    Alumno a1 = new Alumno("Jorge",1997);
    Alumno a2 = new Alumno("Pepin",1999);
    
        System.out.println(" \nEl primer alumno tiene como nombre:  " + a1.getAlias() + 
        " \nLa edad de el primer alumno es " + a1.calcularEdad(a1.getAnioNac() ) +
        " \nEl segundo alumno tiene como nombre:  " + a2.getAlias() +   
        " \nLa edad de el segundo alumno es " + a2.calcularEdad(a2.getAnioNac() ));    
        
        
        
  }


  public static int contar(String a){
        return 0;
  }

  public static String contar(String a){
        return "0";
  }
    
    
}
