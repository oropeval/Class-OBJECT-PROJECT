package com.example.figuras;

public class Rectangulo extends FigurasGeometricas{
private double base;
private double altura;
//constructor
public Rectangulo (double base, double altura) {
	this.base = base;
	this.altura = altura;

}


//override
public double calcularArea() {
	return base * altura;
	
}

public double getBase() {
	return base;
	
}
//setter
public void setBase(double nuevaBase) {
	this.base = nuevaBase;
	
}
//getter
public double getAltura() {
	return altura;
}
//setter 
public void setAltura(double nuevaAltura) {
	this.altura = nuevaAltura;
}


}
