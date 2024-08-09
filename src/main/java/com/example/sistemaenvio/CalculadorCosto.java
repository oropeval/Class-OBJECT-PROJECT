package com.example.sistemaenvio;

public class CalculadorCosto {
    public double calcularCosto(IEnvio envio) {
        // Delegamos el cálculo del costo al objeto Envio específico
        return envio.calcularCosto();
    }
}