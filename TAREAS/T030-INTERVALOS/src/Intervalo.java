public class Intervalo {


    public  int inicio;
    public  int fin;                        // ini < fin


    public Intervalo(int inicio, int fin){
        setFin(fin);
        this.inicio = inicio;
    }
    public void setFin(int fin) {
        assert inicio<fin : "Error : inicio tiene que ser menor que el fin";
        this.fin = fin;

    }
    public  boolean intervalAbiertoC(int e){
        return e > inicio && e <= fin;
    }
    public  boolean intervalAbiertoA(int e){
        return e > inicio && e < fin;
    }
    public  boolean intervalCerradoA(int e){
        return e >= inicio && e < fin;
    }
    public  boolean intervalCerradoC(int e){
        return e >= inicio && e <= fin;
    }


    public boolean solapamiento(Intervalo otro){

     return otro.getInicio() >= inicio && otro.getInicio() <= fin || otro.getInicio() < fin && otro.getInicio() > fin ;

    }

    public boolean inclusion(Intervalo otro){
        return  otro.getInicio() > inicio && fin < otro.getFin();
    }


    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }


}
