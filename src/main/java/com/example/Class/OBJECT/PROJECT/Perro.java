package com.example.Class.OBJECT.PROJECT;

public class Perro {

	private String nombre;
	  private int edad;
	   private String raza;

	  public Perro(String nombre, int edad, String raza) {
		  
		/*
		 *  Se utilizan variables locales con el mismo nombre que los atributos
		 * String nombreLocal = nombre;
		 * int edadLocal = edad;
		 * String razaLocal = raza;
	
		 * Se asignan los valores de las variables locales a los atributos
		 * this.nombre = nombreLocal;
		 * this.edad = edadLocal;
		 * this.raza = razaLocal;
		 * 
		 * 
		 * */
		
		  
	    this.nombre = nombre;
	    this.edad = edad;
	    this.raza = raza;
	  }
	  
	  
	  //metodo  getter
	  //vamos a obtener valores de los atributos
	  /* 
	     * Métodos Getter (para obtener valores de atributos)
	     * 
	     * Se han creado métodos getter para cada atributo: getNombre(), getEdad() y getRaza(). 
	     * Estos métodos permiten obtener los valores de los atributos respectivos, 
	     * pero no modificarlos directamente.
	     * 
	     * 
	     * */
	  
	  public String getNombre() {
		  
		  return nombre;
	  }
  public int getEdad() {
		  
		  return edad;
	  }
  public String getRaza() {
	  
	  return raza;
  }

	  
  /*
   * Métodos Setter (para modificar valores de atributos)
   * 
   * Se han creado métodos setter para cada atributo: setNombre(String nuevoNombre), 
   * setEdad(int nuevaEdad) y setRaza(String nuevaRaza). 
   * Estos métodos permiten modificar los valores de los atributos respectivos,
   *  pero con validaciones adicionales.
   *  
   * */
  
  public void setNombre(String newNombre) {
	  
	  this.nombre = newNombre;
	  
	  
  }
  
  public void setEdad(int newEdad) {
	  
	  this.edad = newEdad;
	  
	  
  }
  public void setRaza(String newRaza) {
	  
	  this.raza = newRaza;
	  
	  
  }
  
  
	  

	  public void ladrar() {
	    System.out.println("¡Guau!");
	  }

	  public void comer() {
	    System.out.println("El perro está comiendo.");
	  }
	
}
