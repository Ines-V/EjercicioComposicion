public class Procesador {
    //Variable privada.
    private int nucleos;

    //Getter y stters.
    public Procesador(int nucleos) {
        setNucleos(nucleos);
    }

    public int getNucleos() {
        return nucleos;
    }

    //Constructor
    public void setNucleos(int nucleos) {
        if (nucleos<=0){ //Nucleos igual o menor que 0 salta un error.
            throw new IllegalArgumentException("Debe de tener mas de 0 nucleos.");
        }
        this.nucleos = nucleos;
    }

    //ToString()
    @Override
    public String toString() { //Lo que se imprime en la clase Main
        return "Procesador{" +
                "nucleos=" + nucleos +
                '}';
    }
}