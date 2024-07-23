package com.example.Class.OBJECT.PROJECT;

public class Main {

	public static void main(String[] args) {
	    Perro miPerro = new Perro("Toby", 3, "Labrador");

	    System.out.println("Nombre: " + miPerro.getNombre());
	    System.out.println("Edad: " + miPerro.getEdad());
	    System.out.println("Raza: " + miPerro.getRaza());

	    
	    
	    miPerro.setNombre("max");
	    miPerro.setEdad(1);
	    miPerro.setRaza("Boston");
	    
	    System.out.println("Nombre: " + miPerro.getNombre());
	    System.out.println("Edad: " + miPerro.getEdad());
	    System.out.println("Raza: " + miPerro.getRaza());
	    
	    
	    
	    
	    
	    miPerro.ladrar();
	    miPerro.comer();
	    
	    
	    gato miGato = new gato("michi", 3, "bengali");

	    System.out.println("Nombre: " + miGato.getNombre1());
	    System.out.println("Edad: " + miGato.getEdad1());
	    System.out.println("Raza: " + miGato.getRaza1());

	    
	    
	    miGato.setNombre1("bigotes");
	    miGato.setEdad1(4);
	    miGato.setRaza1("persa");
	    
	    System.out.println("Nombre: " + miGato.getNombre1());
	    System.out.println("Edad: " + miGato.getEdad1());
	    System.out.println("Raza: " + miGato.getRaza1());
	    
	    miGato.maullar();
	    miGato.ronronear();
	    
	    
	    
	    
	    
	  }
	
}
