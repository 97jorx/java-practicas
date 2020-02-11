
public class Principal
{
   public static void main(String [] args) 
   {
       
       Arma a1 = new Arma("Beretta92F",1500,1);
       Arma a2 = new Arma("USP COMPACT",1500,8);
       Arma a3 = new Arma("GLOCK17",1500,20);
       

       System.out.println(a1);
       a1.disparar();
       System.out.println(a1);
       a1.mirarCargador();
       a1.colocarSilenciador();
       System.out.println();
       System.out.println(a1);
       
   }
}
