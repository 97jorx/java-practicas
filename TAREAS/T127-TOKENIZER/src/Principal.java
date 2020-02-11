import java.util.StringTokenizer;

class Principal {

    public static void main(String args[]) {
        String animal = "Vaca, Cerdo, Perro, Agapornis, Ninfa ";
        mostrar(animales(animal));
    }


    public static String[] animales(String animales) {
        assert animales!=null : "Error : el string de animales no puede ser nulo";

        StringTokenizer st = new StringTokenizer(animales, ",");
        int tokens = st.countTokens();
        String[] arrayanimales = new String[tokens];

        int i = 0;
        while(st.hasMoreTokens() && i < arrayanimales.length) {
            arrayanimales[i] = st.nextToken();
            i++;
        }

        return arrayanimales;
    }

    public static void mostrar(String[] animal) {
        System.out.print(animal[0]);
        for (int i = 1; i < animal.length; i++) {
            System.out.print(", " + animal[i]);

        }
    }

}

