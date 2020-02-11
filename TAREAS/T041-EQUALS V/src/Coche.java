public class Coche {

    private String marca;
    private String color;
    private int peso;
    private int puertas;

    public Coche(){
        marca="";
        color="";
        peso=200;
        puertas=4;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj instanceof Coche) {
            Coche c = (Coche)obj;
            return marca.equals(c.marca);
        } else
        return false;
    }


}
