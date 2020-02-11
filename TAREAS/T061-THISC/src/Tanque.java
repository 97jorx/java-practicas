public class Tanque {
    private int fila; // >=0
    private int columna; // >=0
    private char direccion; //  ‘N’,’S’,’E’,’O’
    private int distancia;

    // <<constructores>>
    public Tanque(){
        this(1,1);
        direccion='N';
    }

    public Tanque(char direccion){
        this(1,1);
        setDireccion(direccion);

    }

    public Tanque(int fila, int columna){
        setColumna(columna);
        setFila(columna);
    }

    //<<accesores>>
    public int getFila(){
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public char getDireccion() {
        return direccion;
    }

    private void setFila(int fila) {
        assert fila >=0 : "Error : la fila tiene que ser mayor o igual que 0";
        this.fila = fila;
    }

    private void setColumna(int columna) {
        assert fila >=0 : "Error : la columna tiene que ser mayor o igual que 0";
        this.columna = columna;
    }

    public void setDireccion(char direccion) {
        assert "NESO".indexOf(direccion)>=0 : "Error : la direccion es incorrecta";
        this.direccion = direccion;
    }

    public void avanzar(int distancia){
     this.distancia+= distancia;
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", direccion=" + direccion +
                '}';
    }
}
