public class Ordenador {
    private String marca;
    private String modelo;
    private Procesador procesador;

    public Ordenador(String marca, String modelo, int nucleos) {
        this.marca = (marca == null || marca.trim().isEmpty()) ? "Desconocida" : marca.trim(); //Para que se imprima "Desconocida" cuando no se introduzcan datos.
        this.modelo = (modelo == null || modelo.trim().isEmpty()) ? "Desconocido" : modelo.trim(); //Para que se introduzca "Desconocida
        this.procesador = new Procesador(nucleos);
    }

    public Ordenador(String marca, String modelo) {
        this(marca, modelo, 4);
    }

    public Ordenador() {
        this("Desconocida","Desconocida",4);
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador=" + procesador +
                '}';
    }
}
