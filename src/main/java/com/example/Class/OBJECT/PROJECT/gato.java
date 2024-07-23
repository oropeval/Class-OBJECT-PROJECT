package com.example.Class.OBJECT.PROJECT;

public class gato {

	private String nombre1;
	  
	private int edad1;
	
	private  String raza1;

	  public gato(String nombre1, int edad1, String raza1) {
		  

		
		  
	    this.nombre1 = nombre1;
	    this.edad1 = edad1;
	    this.raza1 = raza1;
	  }

	 public String getNombre1() {
		 return nombre1;  
	 }
	  
	 public int getEdad1() {
		 return edad1;  
	 }
	  
	 public String getRaza1() {
		 return raza1;  
	 }
	 
	 public void setNombre1(String nuevoNombre1) {
		 this.nombre1 = nuevoNombre1;
		 
				
	 }
	 
	 public void setEdad1(int nuevaEdad1) {
		 this.edad1 = nuevaEdad1;
		 
				
	 }
	 
	 public void setRaza1(String nuevaRaza1) {
		 this.raza1 = nuevaRaza1;
		 
				
	 }
	 
	  
	  public void maullar() {
	    System.out.println("¡miau!");
	  }

	  public void ronronear() {
	    System.out.println("El gato está comiendo.");
	  }
	
}

	
