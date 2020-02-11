import java.util.Arrays;

public class Baraja {


    private Carta[] mazo;
    private static final String[] NOMBRES = {"AS", "2", "3", "4", "5", "6", "7",  "SOTA", "CABALLO", "REY"};
    private static final TipoPalo[] palos = TipoPalo.values();
    private static final int MAXPALOS = 10;

    public Baraja() {
        mazo = new Carta[40];
        setMazo(mazo);
        inicializarMazo();
    }

    public void setMazo(Carta[] mazo) {
        assert mazo != null : "Error : el mazo no puede ser nulo";
        this.mazo = mazo;
    }

    private void inicializarMazo() {
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < MAXPALOS; j++) {
                mazo[i*MAXPALOS+j] = new Carta(NOMBRES[j],palos[i]);
            }
        }

    }



    @Override
    public String toString() {
        return  Arrays.toString(mazo);

    }
}
