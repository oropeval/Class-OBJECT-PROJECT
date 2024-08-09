package ELECTRONIC;

public class Computadora extends Producto{
private String procesador;
private int ram;

public Computadora(String nombre, double precio, String procesador,int ram) {
	super(nombre, precio);
	this.procesador = procesador;
	this.ram = ram;
	
	
	
	
}

@Override 
public String obtenerDescripcion() {
	return "computadora" + nombre + "procesador" + procesador + "RAM" + ram + "GB";
	
}

//sobrecarga para aplicar descuento fijo
public void aplicarDescuento(double descuentoFijo) {
	precio = descuentoFijo;
}


}
