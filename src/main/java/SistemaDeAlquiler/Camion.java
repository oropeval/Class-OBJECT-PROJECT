package SistemaDeAlquiler;

public class Camion extends Vehiculo {
    private int cargaMaxima;
       public Camion(String marca, String modelo, int año, double
precioPorDia, int cargaMaxima) {
           super(marca, modelo, año, precioPorDia);
           this.cargaMaxima = cargaMaxima;
       }
       @Override
       public String toString() {
           return "Camion: " + marca + " " + modelo + ", " + cargaMaxima + "toneladas";
}
}
