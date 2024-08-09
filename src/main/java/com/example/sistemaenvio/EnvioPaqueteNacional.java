package com.example.sistemaenvio;

public class EnvioPaqueteNacional implements IEnvioNacional {
    private double peso;
    private double distancia;
    private double valorDeclarado;
    // Constructor
    public EnvioPaqueteNacional(double peso, double distancia, double
valorDeclarado) {
        this.peso = peso;
        this.distancia = distancia;
        this.valorDeclarado = valorDeclarado;
}
    @Override
    public double calcularCosto() {
        // Costo base por kilogramo
        double costoPorKilogramo = 10.0;
        // Costo base por kilómetro
        double costoPorKilometro = 0.5;
        // Seguro por valor declarado (1% del valor)
        double seguro = valorDeclarado * 0.01;
        return peso * costoPorKilogramo + distancia * costoPorKilometro + seguro + calcularImpuestosLocales();
}
    @Override
    public double calcularImpuestosLocales() {
        // Supongamos un impuesto del 10% sobre el valor declarado
        return valorDeclarado * 0.1;
    }
    @Override
    public String obtenerEstado() {
        // Simulación de un estado aleatorio
        String[] estados = {"enviado", "en tránsito", "entregado"};
        return estados[(int) (Math.random() * estados.length)];
    }
    @Override
    public String obtenerDireccionDestino() {
        // Supongamos que la dirección ya está almacenada
        return "Calle Falsa 123, Ciudad Ejemplo";
    }
}