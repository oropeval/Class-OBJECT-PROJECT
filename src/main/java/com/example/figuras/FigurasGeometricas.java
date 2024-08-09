package com.example.figuras;

public abstract class FigurasGeometricas {
private String nombre;
public static final double PI = Math.PI; //ATRIBUTO ESTATICO
public abstract double calcularArea();

public String getNombre() {
	return nombre;
	
}

public void setNombre(String nuevoNombre) {
	this.nombre = nuevoNombre;
	
}

	

}
