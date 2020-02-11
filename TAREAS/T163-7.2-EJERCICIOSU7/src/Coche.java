public class Coche implements Cloneable {

    private int velocidad;
    private Rueda rueda;

    public Coche(int velocidad, Rueda rueda) {
        setVelocidad(velocidad);
        setRueda(rueda);
    }

    public void setVelocidad(int velocidad) {
        assert velocidad>0 : "Velocidad no puede ser 0";
        this.velocidad = velocidad;
    }

    public void setRueda(Rueda rueda) {
       assert rueda!=null : "Rueda no puede ser nulo";
       this.rueda = rueda;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "velocidad=" + velocidad +
                ", rueda=" + rueda +
                '}';
    }
}