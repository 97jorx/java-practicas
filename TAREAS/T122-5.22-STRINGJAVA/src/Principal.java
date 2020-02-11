public class Principal {

    public static void main(String[] args) {

        String a= " TORTILLA DE PATATAS CON CEBOLLA";
        String b="TORTILLA DE PATATAS SIN CEBOLLA";
        int  c=120;
        System.out.println("A".equalsIgnoreCase("a"));
        System.out.println(b.startsWith(" "));
        System.out.println(a.indexOf('u'));
        System.out.println(a.replaceAll("CON","SIN"));
        System.out.println(b.toLowerCase());
        System.out.println(a.replace('a','o'));
        System.out.println(a.endsWith("l"));
        System.out.println(b.toUpperCase());
        System.out.println(b.split(" "));
        System.out.println(a.trim());                   //elimina los espacios
        System.out.println(a.valueOf(c));

    }
}

