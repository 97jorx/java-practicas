public class Test {

    int prueba;
    String prueba2;

    public Test(int prueba) {
    this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "Test{" +
                "prueba=" + prueba +
                ", prueba2='" + prueba2 + '\'' +
                '}';
    }
}