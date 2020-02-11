public class Principal {
    public static void main(String[] args) {


        try {
            Integer integer = Integer.valueOf("a");
        } catch (Exception e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.printf("Error : se ha introducido un formato erroneo   \n %s", e);
        }

    }
}
