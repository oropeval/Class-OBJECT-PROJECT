package SistemaDeAlquiler;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioTotal;
    private LocalDate fechaDevolucion;
    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio,
LocalDate fechaFin) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        // Calcular el precio total (implementación simplificada)
        this.precioTotal = calcularPrecioTotal();
    }
    // Getters y setters
    public LocalDate getFechaInicio() {
        return fechaInicio;
}
    public LocalDate getFechaFin() {
        return fechaFin;
}
    public Cliente getCliente() {
        return cliente;
}
    // ... otros getters y setters
    public double getPrecioTotal() {
        return precioTotal;
}
    public Vehiculo getVehiculo() {
        return vehiculo;
}
    public double getPrecioPorDia() {
        return vehiculo.getPrecioPorDia();
        
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
}
    private double calcularPrecioTotal() {
        // Aquí se calcularía el precio total del alquiler
        // Basado en el precio por día del vehículo y la duración del alquiler
        long diasAlquiler = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return diasAlquiler * vehiculo.getPrecioPorDia();
} }