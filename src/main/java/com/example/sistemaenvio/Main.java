package com.example.sistemaenvio;

public class Main {
    public static void main(String[] args) {
        // Crear diferentes tipos de envíos
        EnvioPaqueteNacional envioPaquete = new EnvioPaqueteNacional(2.5, 100,
500);
        EnvioDocumentacionInternacional envioDocumentacion = new
EnvioDocumentacionInternacional(0.5, "Estados Unidos", true);
        // Calcular los costos de los envíos y obtener sus resúmenes
        System.out.println(envioPaquete.obtenerResumen());
        System.out.println(envioDocumentacion.obtenerResumen());
        
    }
}