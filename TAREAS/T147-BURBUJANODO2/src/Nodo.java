/**
 * FECHA  : 10/03/2019
 * NOMBRE : JORGE
 * HORA   : 12:41
 */
public class Nodo {
    private int id;

    public Nodo(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof Nodo) {
            Nodo n = (Nodo) o;
            return id == n.id;
        }
        return false;
    }


    public int compareTo(Nodo n) {
        return id - n.id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public float getId() {
        return id;
    }

    public static void burbuja(Nodo[] arr) {
        assert arr != null : "Error : el arr no puede ser nulo";
        int aux = 0;

        for (int i = 0; i < arr.length - 1; i++) { // arr.length --> 5
            for (int j = 1; j < arr.length - i; j++) { // arr.length --> 4 , 3 , 2 , 1
                if (arr[j - 1].compareTo(arr[j]) < 0) {

                    aux = arr[j - 1].id;
                    arr[j - 1].id = arr[j].id;
                    arr[j].id = aux;
                }
            }
        }

    }

    public static void mostrar(Nodo[] valores) {

        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length - 1; i++)
            System.out.print(valores[i].id + ",");
        System.out.print(valores[valores.length - 1].id);

    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

}
