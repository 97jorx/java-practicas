public class Principal {

    public static void main(String[] args) {

        String s1 = new String("JORGE"); // Primitivos  y la referencia hacia el objetos se comparan con ==
        String s2 = new String("Jorge"); // Las cadenas se comparan con el equals.
        System.out.println(s1.equals(s2));


        String s3 = "Jorge";
        String s4 = "Jorge";                    // Da true porque apuntan a la misma referencia


        System.out.println(s3 == s4);
        System.out.println(s1.equals(s3));




    }

}
