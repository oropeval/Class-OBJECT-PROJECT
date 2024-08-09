package com.example.figuras;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//crear un circulo = inicalizar
		
		Circulo circulo1 = new Circulo(5.0);
		circulo1.setNombre("mi circulo");
		
		System.out.print("nombre del circulo " + circulo1.getNombre());
		System.out.print("Area del circulo " + circulo1.calcularArea());
		
		//crear un rectangulo = inicializar
		Rectangulo rectangulo1 = new Rectangulo(4.0, 3.0);
		rectangulo1.setNombre("mi rectangulo");
		
		System.out.print("\nnombre del rectangulo" + rectangulo1.getNombre());
		System.out.print("\nArea del rectangulo" + rectangulo1.calcularArea());
		
		
		
	}

}
