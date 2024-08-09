package SistemaDeAlquiler;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    public Coche(String marca, String modelo, int año, double precioPorDia, int
numeroPuertas) {
        super(marca, modelo, año, precioPorDia);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo + ", " + numeroPuertas + "puertas";
} }