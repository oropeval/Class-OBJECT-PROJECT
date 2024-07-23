package Tienda;

public class Main {
	public static void main(String[] args) {
		
		//crear un producto
		Producto camisa = new Producto(123, "camisa tshirt", 25, 10);
		
//consultar informacion del producto
		System.out.println("ID del producto:" + camisa.getIdProducto());
		System.out.println("Nombre:" + camisa.getNombre());
		System.out.println("Precio Unitario: $" + camisa.getPreciounitario());
		System.out.println("Cantidad en Stock:" + camisa.getCantidad());
		
		//modificar el nombre del producto
		camisa.setNombre("camisa de cuadros");
		
		//consultar el nombre del producto despues de la modificacion
		System.out.println("/nNombre actualizado:" + camisa.getNombre());
		
		//calcular y mostrar el precio total
		double precioTotal = camisa.calcularPrecioTotal();
		System.out.println("/nPrecioTotal (cantidad * precio unitario): $" + precioTotal);
		
	
	}
}



