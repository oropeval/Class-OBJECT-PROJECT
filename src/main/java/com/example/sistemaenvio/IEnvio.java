package com.example.sistemaenvio;

public interface IEnvio {
	double calcularCosto();
    String obtenerEstado();
    String obtenerDireccionDestino();
default String obtenerResumen() {
    return "Envio a: " + obtenerDireccionDestino() +
           ". Estado: " + obtenerEstado() +
           ". Costo total: $" + calcularCosto();
} }


