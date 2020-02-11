public class Coche {

    Coche[] concesionario = new Coche[5];
    String matricula; // ÚNICO POR CADA COCHE, [9999AAA], NN


    public Coche(String matricula) {
        setMatricula(matricula);
    }

    public Coche[] ListaCoches(String[] matricula) {

        assert matricula != null : "Error : la matricula no puede ser nula";
        assert comprobarMatricula(matricula) : "Error : la matricula no tiene formato correcto";
        assert unique(matricula) : "Error : la matricula introducida esta repetida";
        assert matricula.length >= concesionario.length : String.format("Error : la longitud de la lista de matriculas " +
                "tiene que ser igual al numero de coches[%d] ", concesionario.length);

        if (matricula.length == 0)
            return new Coche[0];

        for (int i = 0; i < concesionario.length; i++) {
            concesionario[i] = new Coche(matricula[i]);
        }
        return concesionario;
    }

    private void setMatricula(String matricula) {
        assert matricula != null : "Error : el array de coches no puede ser nulo";
        this.matricula = matricula;
    }


    private boolean comprobarMatricula(String[] matricula) {
        assert matricula != null : "Error: la matricula no puede ser nula";
        boolean correcto = false;

        for (int i = 0; i < matricula.length; i++)
            if (!matricula[i].matches("^[0-9]{4}[A-Z]{3}$"))
                return false;
        return true;
    }


    private boolean unique(String[] matricula) {
        assert matricula != null : "Error: la matricula no puede ser nula";

        boolean correcto = false;

        for (int j = 0; j < matricula.length; j++) {
            for (int i = 0; i < matricula.length; i++)
                if (matricula[i].equals(matricula[j]) && j != i)
                    return false;
        }
        return true;
    }

    public  void mostrar(Coche[] coches) {
        System.out.println(coches[0]);
        for (int i = 1; i < coches.length; i++) {
            System.out.println(coches[i]);
        }
    }

    @Override
    public String toString() {
        return "Coche [" + matricula + "]";
    }

}
