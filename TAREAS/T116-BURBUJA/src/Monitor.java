public class Monitor {

    private float pulgadas;


    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof  Monitor) {
            Monitor monitor = (Monitor) o;
            return pulgadas == monitor.pulgadas;
        }
        return false;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    @Override
    public String toString() {
        return String.valueOf(pulgadas);
    }
}
