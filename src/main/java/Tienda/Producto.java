package Tienda;

public class Producto {
   private int idProducto;
   private String nombre;
   private int cantidad;
   private double precioUnitario;
   
   
   //constructor publico para crear un producto
   public Producto(int idProducto, String nombre, double precioUnitario, int cantidad) {
	  this.idProducto = idProducto;
	  this.nombre = nombre;
	  this.precioUnitario = precioUnitario;
	  this.cantidad = cantidad; 
   }
   
   //metodo getter para obtener el id del producto
   public int getIdProducto() {
	   return idProducto;
   }
   
   //metodo getter para obtener el nombre del producto
   public String getNombre() {
	   return nombre;
   }
   //metodo Setter para establecer el nombre del producto
   public void setNombre(String nuevoNombre) {
	   this.nombre = nuevoNombre;
	   
   }
   //metodo Getter para obtener el preicio unitario
   public double getPreciounitario() {
	   return precioUnitario;
   }
   //metodo Setter para establecer precio unitario
   public void setPrecioUnitario(double nuevoPrecio) {
	   if (nuevoPrecio > 0) {
		   this.precioUnitario = nuevoPrecio;
		   
	   }else {
		   System.out.println("ERROR: el precio unitario debe ser mayor a 0");
	   }
	   
   }
   
   //METODO GETTER PARA OBTENER LA cantidad en stock
   public int getCantidad() {
	   return cantidad;
   }
   
   //metodo setter para establecer la cantidad en stock
   public void serCantidad(int nuevaCantidad) {
	   if (nuevaCantidad >= 0) {
		   this.cantidad = nuevaCantidad;
	   } else {
		   System.out.println("ERROR, LA CANTIDAD EN STOCK NO PUEDE SER NEGATIVA");
	   }
   }
   
   //METODO PARA CALCULAR EL PRECIO TOTAL DE UN PRODUCTO (cantidad * precio unitario)
   public double calcularPrecioTotal() {
	   return precioUnitario * cantidad;
	  
   }
   
}














