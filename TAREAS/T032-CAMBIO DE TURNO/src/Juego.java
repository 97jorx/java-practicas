
public class Juego {
    private static int turno = 0;

    public  void cambiarTurno() {
        turno = (turno+1) % 2;
    }
    public void cambiarTurno(int jugadores){
            turno = (turno+1) % jugadores;
    }
    public int getTurno() {
        return turno;
    }

}
