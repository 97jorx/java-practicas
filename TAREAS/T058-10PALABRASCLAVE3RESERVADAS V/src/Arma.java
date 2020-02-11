/**
 * @author (Jorge) 
 * @version (Inicio)
 *(NEW)
 *(THIS)
 *(PRIVATE)
 *(PUBLIC)
 *(RETURN)
 *(ELSE)
 *(INT)
 *(VOID)
 *(BOOLEAN)
 *(ASSERT)
 *(TRUE)
 *(FALSE)
 *(NULL)
 */

public class Arma

{
    private String modelo;
    private int peso;           // >0
    private int balas;          // >0
    private boolean silenciador;       // colocado, no colocado

    
    public Arma(String modelo, int peso, int balas)
    {
        setModelo(modelo);
        setPeso(peso);
        setBalas(balas);
    }

    private void setPeso(int peso){ 
        assert peso > 0 : String.format("Error: El peso(%d) no puede ser negativo", peso);
        this.peso = peso;
    }


    private void setModelo(String modelo)
    {
        assert modelo!=null : "Error : se debe introducir un modelo no puede ser nulo";
        assert !modelo.isEmpty() : "Error : el modelo introducido no puede ser vacio";
        this.modelo = modelo;
    }

    public  int getPeso()
    {
        return peso;
    }

    private void setBalas(int balas) {
        assert balas >=0 : String.format("Error: El numero de balas(%d) no puede ser negativo", balas);
        this.balas = balas;
    }

    public void disparar(){
        if(balas>0) {
            setBalas(--balas);
        } else if(balas==0) {
            System.out.println("Error : el arma no tiene balas, RECARGA!");
        }

    }

    public void mirarCargador()
    {
        if (balas>0) {
            System.out.format("El cargador tiene (%d) balas", balas);
        } else {
            System.out.format("El cargador esta vacio (%d) balas", balas);
        }
    }


    public void colocarSilenciador(){
        if(silenciador){
            silenciador=false;
        } else {
            silenciador=true;
        }
    }

    @Override
    public String toString() {
        return "Arma{" +
                "modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", balas=" + balas +
                ", silenciador=" + silenciador +
                '}';
    }
}

