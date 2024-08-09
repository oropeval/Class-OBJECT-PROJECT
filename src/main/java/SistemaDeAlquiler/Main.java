package SistemaDeAlquiler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear vehículos
        Coche coche = new Coche("Ford", "Fiesta", 2023, 50.0, 5);
        Motocicleta moto = new Motocicleta("Honda", "CBR600RR", 600, 70.0, 1);
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678A");
        Cliente cliente2 = new Cliente("María García", "87654321B");
        // Alquilar vehículos
        Alquiler alquiler1 = cliente1.alquilarVehiculo(coche, LocalDate.of(2024, 8, 04), LocalDate.of(2024, 8, 5));
        if (alquiler1 != null) {
            System.out.println("Alquiler realizado correctamente.");
}
        Alquiler alquiler2 = cliente2.alquilarVehiculo(moto, LocalDate.of(2024, 8, 04), LocalDate.of(2024, 8, 9));
        if (alquiler2 != null) {
            System.out.println("Alquiler realizado correctamente.");
}
        // Devolver vehículos
        cliente1.devolverVehiculo(coche);
        alquiler1.setFechaDevolucion(LocalDate.now());
        cliente2.devolverVehiculo(moto);
        alquiler2.setFechaDevolucion(LocalDate.now());
        // Mostrar información de los vehículos
        System.out.println("Información del coche:");
        System.out.println(coche); // Usando el método toString() del coche
        System.out.println("Información de la moto:");
        System.out.println(moto); // Usando el método toString() de la moto
        // Mostrar información de los alquileres
        System.out.println("\nInformación del alquiler 1:");
        System.out.println("Cliente: " + alquiler1.getCliente().getNombre());
        System.out.println("Vehículo: " + alquiler1.getVehiculo());
        System.out.println("Fecha de inicio: " + alquiler1.getFechaInicio());
        System.out.println("Fecha de fin: " + alquiler1.getFechaFin());
        System.out.println("Precio total: $" + alquiler1.getPrecioTotal());
     // Mostrar información de los alquileres
        System.out.println("\nInformación del alquiler 2:");
        System.out.println("Cliente: " + alquiler2.getCliente().getNombre());
        
        System.out.println("Vehículo: " + alquiler2.getVehiculo());
        System.out.println("Fecha de inicio: " + alquiler2.getFechaInicio());
        System.out.println("Fecha de fin: " + alquiler2.getFechaFin());
        System.out.println("Precio total: $" + alquiler2.getPrecioTotal());
} }
        
        
        