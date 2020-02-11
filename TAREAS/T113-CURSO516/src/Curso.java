import java.util.Arrays;

public class Curso {


    private static final int MAXESTUDIANTES = 5;
    private static final int MAXASIGNATURAS = 3;

    // Array de estudiantes
    private int[][] notas;
    private Estudiante[] estudiantes;

    public Curso(String[] n) {
        inicializarEstudiantes(n);
        inicializarNotas();

    }

    private void inicializarEstudiantes(String[] n){
        assert n!=null: "Error : el array de nombres no puede ser nulo";
        assert n.length <= MAXESTUDIANTES  : "Error : el array estudiantes no puede terner mas de 5 alumnos";

        estudiantes = new Estudiante[MAXESTUDIANTES];
        for (int i = 0; i < n.length ; i++) {
            estudiantes[i] = new Estudiante(n[i]);

        }

    }


    private void inicializarNotas(){
        notas = new int[MAXESTUDIANTES][MAXASIGNATURAS];
        for (int i = 0; i < notas.length ; i++) {
            for (int j = 0; j < notas[i].length ; j++) {
                notas[i][j] = (int) (Math.random() * 10 + 1);
                estudiantes[i].setNota(notas[i][j]);
            }
        }
    }

    private float[] mediaAritmeticaNotas(){
        float[] medias = new float[MAXESTUDIANTES];
        for (int i = 0; i < notas.length ; i++) {
            for (int j = 0; j < notas[i].length ; j++) {
                medias[i] += (float)notas[i][j] / notas[i].length ;
            }
        }
        return medias;


    }

    public void mostrarNotas() {
        String r = "";
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (j > 0)
                    System.out.print(", ");
                System.out.print((j==0) ? estudiantes[i]+" -> "+notas[i][j]  :  notas[i][j]  );
            }
            System.out.println();
        }
    }


 /*   private  double mediaPonderada() {
        int media = 0;
        int sumPesos = 0;
        double[] pesos = new double[]{0.3,0.5};

        for (int i = 0; i < notas.length; i++) {
            sumPesos += notas[i];
        }

        for (int i = 0; i < notas.length ; i++) {
            media += array[i] * pesos[i];
        }
        return media;
    }*/

}
