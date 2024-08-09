package ELECTRONIC;

public abstract class Producto {
protected String nombre;
protected double precio;
static int productosVendidos = 0;

public Producto(String nombre, double precio) {
	this.nombre = nombre;
	this.precio = precio;
	productosVendidos++;
}
//getter
	public double getPrecio(){
		return precio;
	}
	public abstract String obtenerDescripcion();
	
	public void aplicarDescuento(double porcentaje) {
		precio *= (1 - porcentaje / 100);
		
	}
	
	
	
	
}




