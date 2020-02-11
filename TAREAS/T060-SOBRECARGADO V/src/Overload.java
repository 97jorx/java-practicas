public class Overload {


	public void calculadora() {

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-3d %-3s %-3d %n", i ,"x 5 = ", i * 5);
		}
	}

	public void calculadora(int numero) {

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-3d %-3s %-3d %n", i ,"x "+numero+ " =", i * numero);
		}
	}

    public void mostrar(char s){
        for (int i = 0; i < 5; i++) {
            System.out.printf("%c %n", s+i);
        }
    }

	public void mostrar(String s){
		for (int i = 0; i < 5; i++) {
			System.out.printf("%c %n", s.charAt(0)+i);
		}
	}

    public void mostrar(){
        for (int i = 0; i < 255 ; i++) {
            System.out.println(i +" : "+ (char)i);
        }
    }

}