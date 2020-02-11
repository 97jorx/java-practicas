public class Rango {
    private int a;
    private int b;


    public Rango(int a, int b) {
        setA(a);
        setB(b);
    }

    public void setA(int a) {
        assert a >= 0 : "Error : el extremo izquierdo tiene que ser mayor que 0";
        this.a = a;
    }

    public void setB(int b) {
        assert b > 0 : "Error : el extremo derecho tiene que ser mayor que 0";
        assert b > a : "Error : el extremo derecho no puede ser menor que el extremo izquierdo";
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}
