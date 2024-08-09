package ELECTRONIC;

public class Main {
public static void main(String[]args) {
	
	Computadora compu1 = new Computadora("Dell XPS", 1500, "intel core", 16);
	Smarthphone celular1 = new Smarthphone("iPhone 14", 1000, "IOS", 6.1);
	
	System.out.println(compu1.obtenerDescripcion());
	System.out.println(celular1.obtenerDescripcion());
	
	double precioOriginalCompu = compu1.getPrecio();
	//sobrecarga de metodos
	
	compu1.aplicarDescuento(10);
	double precioconDescuentoCompu = compu1.getPrecio();
	
	System.out.println("/nPrecio original de la computadora $" + precioOriginalCompu);
	System.out.println("/nPrecio con descuento de la computadora: $" + precioconDescuentoCompu);
	
	
	compu1.aplicarDescuento(5);
	double precioconDescuentoCompu1 = compu1.getPrecio();
	
	System.out.println("/nPrecio original de la computadora $" + precioOriginalCompu);
	System.out.println("/nPrecio con descuento de la computadora: $" + precioconDescuentoCompu1);
	
	
	System.out.println("/nTotal de productos vendidos:" + Producto.productosVendidos);
	
	
	
	
	
	
}
}
