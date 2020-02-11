public class Principal {

    public static void main(String[] args) {

        Personaje[] personajes = new Personaje[]{new Personaje("Jorgito",180),
                                        new Personaje("Jaimito",150),
                                        new Personaje("Joselito",190),
                                        new Personaje("Jaimito",170)};

        Personaje.mostrar(Personaje.buscarLineal(personajes, new Personaje("Jaimito",150)));


    }
}
