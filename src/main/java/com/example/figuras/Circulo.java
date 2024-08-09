package com.example.figuras;


public class Circulo extends FigurasGeometricas {

private double radio;

//getter
public double getRadio() {
	return PI * radio * radio;

}


//constructor
public Circulo(double radio) {
	this.radio = radio;
}

@Override
public double calcularArea() {
	return PI *  radio  * radio;
	
	
}

public void establecer (double nuevoRadio) {
	this.radio = nuevoRadio;
	
	
}






}
