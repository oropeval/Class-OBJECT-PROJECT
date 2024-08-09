package com.example.sistemaenvio;

public class EnvioDocumentacionInternacional implements IEnvioInternacional {
    private double peso;
    private String paisDestino;
    private boolean requiereTraduccion;
    // Constructor
    public EnvioDocumentacionInternacional(double peso, String paisDestino,
boolean requiereTraduccion) {
        this.peso = peso;
        this.paisDestino = paisDestino;
        this.requiereTraduccion = requiereTraduccion;
}
    @Override
    public double calcularCosto() {
        // Costo base por kilogramo
        double costoPorKilogramo = 15.0; // Mayor costo por ser documentación
        // Costo base por país (simplificado)
        double costoPorPais = 50.0;
        // Costo adicional por traducción (si aplica)
        double costoTraduccion = requiereTraduccion ? 100.0 : 0.0;
        return peso * costoPorKilogramo + costoPorPais +
calcularArancelesAduaneros() + costoTraduccion;
}
    @Override
    public double calcularArancelesAduaneros() {
        // Simulación simplificada de aranceles aduaneros
        // En una implementación real, se consultarían tarifas aduaneras
//específicas para cada país
        double arancelBase = 50.0;
        return arancelBase;
    }
    @Override
    public String obtenerEstado() {
        // Simulación de un estado aleatorio
        String[] estados = {"enviado", "en aduana", "en tránsito",
"entregado"};
        return estados[(int) (Math.random() * estados.length)];
    }
    @Override
    public String obtenerDireccionDestino() {
        // Supongamos que la dirección ya está almacenada en un formato internacional

return "Calle Principal 123, Ciudad, País";
}
}






