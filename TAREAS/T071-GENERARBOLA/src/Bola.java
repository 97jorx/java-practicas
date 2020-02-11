import java.util.Random;

public class Bola
{
    private int numero;             // >=1, AUTO, UNIQUE
    private static int contador=0;  // >=0
    private TipoColor color;        // NOT NULL
    private boolean colocada;       // Indica si la bola está colocada en alguna urna
    
    public Bola(TipoColor color) {
        incContador();
        setNumero(contador);
        setColor(color);
        colocada = false;
    }
    
    private void setNumero(int numero) {
        assert numero >= 1 : "Error: el número de una bola debe ser >= 1 ("+numero+")";
        this.numero = numero;
    }
    
    private void incContador() {
        contador++;
    }
    
    private void setColor(TipoColor color) {
        assert color != null : "Error: el color de una bola no puede ser nulo";
        this.color = color;
    }



    public  static Bola generarBola() {


            int numero = (int)(Math.random()*6)+1;
            TipoColor tp = null;

            switch (numero) {
                case 1: tp =TipoColor.AMARILLO;break;
                case 2: tp =TipoColor.BLANCO;break;
                case 3: tp =TipoColor.NEGRO;break;
                case 4: tp =TipoColor.ROJO;break;
                case 5: tp =TipoColor.VERDE;break;
                case 6: tp =TipoColor.AZUL;break;
                default:
                    assert false: "Error : inesperado";
            }

        return new Bola(tp);
    }


    public boolean estaColocada() {
        return colocada;
    }
    
    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }
    
    public String toString() {
        return "Bola "+numero+" ("+color+")";
    }
}
