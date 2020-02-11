import java.util.Arrays;

public class Tablero {
    private Robot[] robots;
    private int aforo;

    public Tablero(int aforo) {
        setAforo(aforo);
        robots = new Robot[aforo];

    }

    public void setAforo(int aforo) {
        assert aforo > 0 : "Error: el numero de objetos robot tiene que ser mayor que 0";
        this.aforo = aforo;
    }



    public boolean colocar(Robot robot) {
        assert robot != null : "Error: el robot a agregar al tablero no puede ser nulo";

        for (int i = 0; i < aforo; i++) {
            if (robots[i] == null) {
                robots[i] = robot;
                break;
            }
        }

        return false;
    }

    public void mostrar() {
        System.out.print(robots[0]);
        for (int i = 1; i < robots.length; i++) {
            System.out.print("," + robots[i]);
        }

    }

    @Override
    public String toString() {
        return String.format("Tablero %d ->", aforo);
    }


}