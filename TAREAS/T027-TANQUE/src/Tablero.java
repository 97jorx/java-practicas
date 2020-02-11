public class Tablero {

        public static final int MINFILA = 3;
        public static final int MINCOLUMNA = 2;
        public static final int MAXFILA = 6;
        public static final int MAXCOLUMNA = 5;
        private final int FILA;                     // >= MINFILA
        private final int COLUMNA;                  // >= MINCOLUMNA


        public Tablero(int fila, int columna) {
            setFila(fila);
            setColumna(columna);
            COLUMNA = columna;
            FILA = fila;


        }

    private void setColumna(int columna) {
        assert columna<=MAXCOLUMNA && columna >=MINCOLUMNA; // [2,5]

    }

    private void setFila(int fila){
        assert fila<=MAXFILA && fila >=MINFILA : "Error: la fila tiene que ser menor que MAXFILA y menor que MINFILA";             // [3,6]
    }


    @Override
    public String toString() {
        return "Tablero{" +
                "FILA=" + FILA +
                ", COLUMNA=" + COLUMNA +
                '}';
    }
}
