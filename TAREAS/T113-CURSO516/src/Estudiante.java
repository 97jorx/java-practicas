public class Estudiante {

    private String nombre;
    private int nota;

    public Estudiante(String nombre) {
        setNombre(nombre);


    }

    private void setNombre(String nombre) {
        assert nombre != null : "Error: el nombre de un estudiante no puede ser nulo";
        assert !nombre.isEmpty() : "Error: el nombre de un estudiante no puede ser vacío";
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        assert nota >= 0 : "Error : la nota no puede ser menor de 0";
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
