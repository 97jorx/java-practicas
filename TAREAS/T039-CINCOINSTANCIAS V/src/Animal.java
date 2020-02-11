public class Animal {

    private static int contador = 0;   // Las variables estáticas almacenan su valor hasta que le programa termina.
    private int numero;
    private final int CAPACIDAD= 5;

    public Animal(){
        setNumero(numero=++contador);
    }

    private void setNumero(int numero){
        assert this.numero<=5 : String.format("Error: El número (%d) de animales creados no pueden ser mayor de %d"
                                              , numero, CAPACIDAD);
    }

    public int getNumero(){
        return numero;
    }


}
