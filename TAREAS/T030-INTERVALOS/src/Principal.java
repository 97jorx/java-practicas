public class Principal {

    public static void main(String[] args) {
        Intervalo i1 = new Intervalo(1,4);          // FALSE
        Intervalo io1 = new Intervalo(5,7);

        Intervalo i2 = new Intervalo(10,13);        // FALSE
        Intervalo io2 = new Intervalo(5,9);

        Intervalo i3 = new Intervalo(100,150);      // FALSE
        Intervalo io3 = new Intervalo(1,5);


        Intervalo i4 = new Intervalo(3,5);          // TRUE
        Intervalo io4 = new Intervalo(4,7);

        Intervalo i5 = new Intervalo(3,5);          //TRUE
        Intervalo io5 = new Intervalo(4,7);

        Intervalo i6 = new Intervalo(1,7);
        Intervalo io6 = new Intervalo(2,6);         // FALSE

        System.out.println(i1.solapamiento(io1));
        System.out.println(i2.solapamiento(io2));
        System.out.println(i3.solapamiento(io3));
        System.out.println(i4.solapamiento(io4));
        System.out.println(i5.solapamiento(io5));
        System.out.println(i6.solapamiento(io6));


    }



}
