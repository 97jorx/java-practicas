public class OlivaJar {

    /*private static Oliva[] olivas;


    static {
        System.out.println("Inicializando...");
        olivas = new Oliva[3];
        olivas[0] = new Oliva("ORO");
    }*/

    private Oliva[] olivas;


    {
        System.out.println("Inicializando...");
        olivas = new Oliva[3];
        olivas[0] = new Oliva("ORO");

    }

    public OlivaJar(int n, String nombre) {
        System.out.println("Constructor...");
        for (int i = 1; i < n; i++) {
            olivas[i] = new Oliva(nombre);
        }
    }


    public Oliva[] getOlivas() {
        return olivas;
    }

}
