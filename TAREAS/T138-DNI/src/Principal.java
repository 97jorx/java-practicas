public class Principal {

    private final static String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static void main(String[] args) {
        int dni = 49046520;
        System.out.print(letraDni(dni));

    }

    public static String letraDni(int dni) {
        assert dni > 0 : "Error: el numero de DNI no puede ser negativo";
        assert dni == 8 : "Error: el  dni debe tener 8 digitos";

        return String.valueOf(dni) + String.valueOf(letrasDNI.charAt(dni % 23));
    }

}
