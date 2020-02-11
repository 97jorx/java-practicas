  public class Util {

      private Util(){                               // Los construcctores de las clases utility son privados

      }

      public static boolean intervalCerradoC(int e, int ini, int fin){ // CERRADO
          assert ini<fin : "Error : inicio tiene que ser menor que el fin";
          return (e >= ini && e <= fin);
      }

      public static boolean intervalCerradoA(int e, int ini, int fin){ // CERRADO-ABIERTO
          assert ini<fin : "Error : inicio tiene que ser mayor que el fin";
          return (e >= ini && e < fin);
      }

      public static boolean intervalAbiertoC(int e, int ini, int fin){ // ABIERTO-CERRADO
          assert ini<fin : "Error : inicio tiene que ser mayor que el fin";
          return (e > ini && e <= fin);
      }

      public static boolean intervalAbiertoA(int e, int ini, int fin){ // ABIERTO
          assert ini<fin : "Error : inicio tiene que ser mayor que el fin";
          return ( e > ini && e < fin);
      }


      public static boolean inclusion(int inicio, int fin, int otroini, int otrofin ){
          return  otroini >= inicio || fin >= otrofin;
      }

      public static boolean solapamiento(int inicio, int fin, int otroinicio, int otrofin){

          return otroinicio <= inicio || inicio >= otrofin || otroinicio <= fin || fin >= otrofin;
      }

  }
   

