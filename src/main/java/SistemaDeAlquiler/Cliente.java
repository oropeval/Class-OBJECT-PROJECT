package SistemaDeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nombre;
    private String dni;
    private List<Alquiler> alquileres;
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.alquileres = new ArrayList<>();
}
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public String getdni() {
return dni; }
    public List<Alquiler> getAlquileres() {
        return alquileres;
}
    public Alquiler alquilarVehiculo(Vehiculo vehiculo, LocalDate fechaInicio,
LocalDate fechaFin) {
        if (vehiculo.isDisponible() && fechaInicio.isBefore(fechaFin)) {
            Alquiler alquiler = new Alquiler(this, vehiculo, fechaInicio,fechaFin);
            alquileres.add(alquiler);
            vehiculo.alquilar();
            return alquiler;
        } else {
            if (!vehiculo.isDisponible()) {
                System.out.println("El vehículo no está disponible.");
            } else {
                System.out.println("La fecha de inicio debe ser anterior a la fecha de fin.");
            }
            return null;
        }
}
    public void devolverVehiculo(Vehiculo vehiculo) {
        // Buscar el alquiler correspondiente y marcarlo como devuelto
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getVehiculo().equals(vehiculo)) {
                alquiler.setFechaDevolucion(LocalDate.now());
                vehiculo.devolver();
                System.out.println("El vehículo ha sido devuelto por " + nombre);
                return;
            }
        }
        System.out.println("El cliente no tiene este vehículo alquilado.");
    }

}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	