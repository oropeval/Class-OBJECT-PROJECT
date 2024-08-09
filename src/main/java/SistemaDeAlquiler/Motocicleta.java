package SistemaDeAlquiler;

public class Motocicleta extends Vehiculo {
    private int cilindrada;
    public Motocicleta(String marca, String modelo, int año, double
precioPorDia, int cilindrada) {
        super(marca, modelo, año, precioPorDia);
        this.cilindrada = cilindrada;
    }
    @Override
    public String toString() {
        return "Motocicleta: " + marca + " " + modelo + ", " + cilindrada + "cilindrada";
} }