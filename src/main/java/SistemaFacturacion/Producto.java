package SistemaFacturacion;

public abstract class Producto {
	private String nombre;
	private double precio;
	
	//constructor
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
//getters
	public String getNombre(){
		return nombre;
		
	}
	public double getPrecio() {
		return precio;
	}
	
	
}
