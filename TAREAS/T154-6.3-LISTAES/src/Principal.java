/**
 * FECHA  : 13/03/2019
 * NOMBRE : JORGE
 * HORA   : 10:51
 */
public class Principal {

    public static void main(String[] args) {
        Lista impares = new Lista();

        for (int i = 1; i <= 10 ; i+=2)
            impares.agregar(new Nodo(i));
        System.out.println(impares);

       /* impares.insertar(new Nodo(2));
        System.out.println(impares);*/

        System.out.println(impares.getId());


       /* Nodo n1 = new Nodo(2);
        Nodo n2 = new Nodo(2);
        System.out.println(n1.equals(n2));*/



    }



}
