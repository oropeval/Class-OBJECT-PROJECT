package SistemaDeAlquiler;

public abstract class Vehiculo {
    protected String marca;
     protected String modelo;
     protected int año;
     private double precioPorDia;
     private boolean disponible;
     public Vehiculo(String marca, String modelo, int año, double
precioPorDia) {
         this.marca = marca;
         this.modelo = modelo;
         this.año = año;
         this.precioPorDia = precioPorDia;
         this.disponible = true;
}
     // Getters y setters
     public String getMarca() {
         return marca;
     }
     public double getPrecioPorDia() {
         return precioPorDia;
     }
     // ... otros getters y setters
     public boolean isDisponible() {
         return disponible;
}
     public void alquilar() {
         if (disponible) {
             disponible = false;
             System.out.println("El vehículo ha sido alquilado.");
         } else {
             System.out.println("El vehículo no está disponible.");
         }
}
     public void devolver() {
         disponible = true;
         System.out.println("El vehículo ha sido devuelto.");
}
}