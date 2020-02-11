import static java.lang.Double.isInfinite;
import static java.lang.Float.isInfinite;
import static java.lang.Double.isNaN;
import static java.lang.Float.isNaN;



public class Principal {
    public static void main(String[] args) {


        // System.out.println(divisionInt(1,0));            //    / by zero
        // System.out.println(divisionInt(0,0));            //    / by zero
        // System.out.println(divisionInt(0,-0));           //    / by zero
        // System.out.println(divisionInt(-0,-0));          //    / by zero
        // System.out.println(divisionInt(-0,0));           //    / by zero

        // System.out.println(divisionFloat(1F,0F));        //    Infinity
        // System.out.println(divisionFloat(0F,0F));        //    NaN
        // System.out.println(divisionFloat(0F,-0F));       //    NaN
        // System.out.println(divisionFloat(-0F,-0F));      //    NaN
        // System.out.println(divisionFloat(-0F,0F));       //    NaN

        // System.out.println(divisionDouble(1F,0F));       //    Infinity
        // System.out.println(divisionDouble(0F,0F));       //    NaN
        // System.out.println(divisionDouble(0F,-0F));      //    NaN
        // System.out.println(divisionDouble(-0F,-0F));     //    NaN
        // System.out.println(divisionDouble(-0F,0F));      //    NaN


         System.out.println(isInfinite(divisionDouble(1F,0F)));
         System.out.println(isNaN(divisionDouble(0F,0F)));

         System.out.println(isInfinite(divisionFloat(1F,0F)));
         System.out.println(isNaN(divisionFloat(0F,0F)));

    }


    public static int divisionInt(int a, int b) {
        return a / b;
    }

    public static float divisionFloat(float a, float b) {
        return a / b;
    }

    public static double divisionDouble(double a, double b) {
        return a / b;
    }

}
