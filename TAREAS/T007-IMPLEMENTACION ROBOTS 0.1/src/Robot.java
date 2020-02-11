public class Robot {

    private static final String ORIENTACIONES = "NESO";
    private static final String GENERACIONES = "ABM";
    private static int contador = 0;
    private int numero;                     // {>=1}
    private String alias;                   //{NO NULO, NO VACIO NO MODIFICABLE}
    private char generacion;                // {A,B,M}
    private char orientacion;               // {N,E,S,O}
    private int distancia;                  // {>=0}


    public Robot(String alias, char generacion) {
        setAlias(alias);
        setGeneracion(generacion);
        setNumero(++contador);
        setOrientacion(orientacionAleatoria());

    }

    public void avanzar(int distancia) {
        assert distancia > 0 : String.format("Error la %d tiene que ser mayor que 0", distancia);
       this.distancia+=distancia;
    }

    public void girar() {
        orientacion = ORIENTACIONES.charAt((ORIENTACIONES.indexOf(orientacion)+1)%ORIENTACIONES.length());
    }

    private void setOrientacion(char orientacion) {
        assert ORIENTACIONES.indexOf(orientacion) >= 0 :
                String.format("Orientacion incorrecta %c, orientacion correcta N, E, S o O", orientacion );
        this.orientacion = orientacion;
    }

    public char orientacionAleatoria() {
         int numero = (int) (Math.random()*ORIENTACIONES.length());
         return ORIENTACIONES.charAt(numero);
    }


    private void setAlias(String alias) {
        assert alias != null : "Error: el alias no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias no puede ser vacío";
        this.alias = alias;
    }




    private void setNumero(int numero) {
        assert numero >= 1 : String.format("Error: el numero (%d) de id tiene que empezar por el 1", numero);
        this.numero = numero;
    }




    private void setGeneracion(char generacion) {
        assert GENERACIONES.indexOf(generacion) >=0 :
                String.format("ERROR : La generacion %c incorrecta, deben ser %s ", GENERACIONES);

        this.generacion = generacion;
    }




    public void saludar(String texto) {

        System.out.println(texto+" "+alias+" "+codigo());
    }



    private String codigo() {

        return "\n Generacion: " +generacion +"\n ID: "+ numero;


    }





    @Override
    public String toString() {
        return "Robot{" +
                "numero=" + numero +
                ", alias='" + alias + '\'' +
                ", generacion=" + generacion +
                ", orientacion=" + orientacion +
                ", distancia=" + distancia +
                '}';
    }


}

