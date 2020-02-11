/**
 * FECHA  : 10/03/2019
 * NOMBRE : JORGE
 * HORA   : 16:30
 */

import java.text.Collator;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {


        String[] palabras = {"capa","caña","ñapa","tapa","fácil","facil","pepino",""};
        Collator collator = Collator.getInstance( new Locale("es","Es"));



        for (int i = 0; i < palabras.length-1 ; i++) {
            collator.setStrength(Collator.PRIMARY);
            System.out.print("FUERZA: PRIMARY\t\t"+collator.getStrength());

            System.out.printf("\tcompare(%s,%s) = %d\n", palabras[i], palabras[i+1],
                    collator.compare(palabras[i],palabras[i+1]));

        }


        System.out.println();
        for (int i = 0; i < palabras.length-1 ; i++) {
            collator.setStrength(Collator.SECONDARY);
            System.out.print("FUERZA: SECONDARY\t\t"+collator.getStrength());
            System.out.printf("\tcompare(%s,%s) = %d\n", palabras[i], palabras[i+1],
                    collator.compare(palabras[i],palabras[i+1]));

        }


        System.out.println();
        for (int i = 0; i < palabras.length-1 ; i++) {
            collator.setStrength(Collator.TERTIARY);
            System.out.print("FUERZA: TERTIARY\t\t"+collator.getStrength());
            System.out.printf("\tcompare(%s,%s) = %d\n", palabras[i], palabras[i+1],
                    collator.compare(palabras[i],palabras[i+1]));

        }




        System.out.println();
        for (int i = 0; i < palabras.length-1 ; i++) {
            collator.setStrength(Collator.IDENTICAL);
            System.out.print("FUERZA: IDENTICAL\t\t"+collator.getStrength());
            System.out.printf("\tcompare(%s,%s) = %d\n", palabras[i], palabras[i+1],
                    collator.compare(palabras[i],palabras[i+1]));
        }

    }


}




