public class Semaforo {

    TipoColor color;

    public Semaforo(TipoColor color) {
        setColor(color);
    }


    public void setColor(TipoColor color) {
        if(color == null  )
        throw new IllegalStateException("Error : el objeto ya no es nulo");

        this.color = color;
    }


}
