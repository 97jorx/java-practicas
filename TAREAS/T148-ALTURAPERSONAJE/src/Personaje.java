public class Personaje {

    private String alias;
    private int altura;

    public Personaje(String alias, int altura) {
        setAlias(alias);
        setAltura(altura);
    }

    public void setAlias(String alias) {
        assert alias != null : "Error : el alias no puede ser nulo";
        this.alias = alias;
    }

    public void setAltura(int altura) {
        assert altura > 0 : "Error : el alias no puede ser nulo";
        this.altura = altura;
    }

    public String getAlias() {
        return alias;
    }

    public int getAltura() {
        return altura;
    }


    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Personaje) {
            Personaje personaje = (Personaje) o;
           if( alias.equals(personaje.alias) )
              return altura==personaje.altura;
        }
        return false;
    }




    public static int[] buscarLineal(Personaje[] personajes, Personaje pBuscado) {
        assert personajes != null : "Error : el array no puede ser nulo";
        assert pBuscado != null : "Error : el valor buscado no puede ser nulo";

        int contador = 0;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i].alias.equals(pBuscado.alias))
                contador++;
        }

        if(contador==0){
            return new int[0];
        }

        int[] posicion = new int[contador];
        for (int j = 0, a = 0; j < personajes.length; j++)
            if (personajes[j].alias.equals(pBuscado.alias)) {
                posicion[a] = j;
                a++;
            }

        return posicion;
    }

    public static void mostrar(int[] numeros) {
        assert numeros != null : "Error : el valor buscado no puede ser nulo";

        if(numeros.length==0)
            return;

        System.out.print(numeros[0]);
        for (int i = 1; i < numeros.length; i++)
            System.out.print( " ," + numeros[i]);

    }

    @Override
    public String toString() {
        return String.format("%s %d", alias, altura);
    }
}
