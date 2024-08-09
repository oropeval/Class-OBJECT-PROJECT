package SistemaFacturacion;

public class Main {
    public static void main(String[] args) {
    	CarritoDeCompras carrito = new CarritoDeCompras();// --------->   AQUI SE CUMPLE EL PRINCIPIO DE SUSTITUCION
        Libro libro = new Libro("Don Quijote", 15.99, "Miguel de Cervantes");
        Electronico electronico = new Electronico("iPhone 14", 999.99, "Apple");

        carrito.agregarProducto(libro);// --------->   AQUI SE CUMPLE EL PRINCIPIO DE SUSTITUCION
        carrito.agregarProducto(electronico);// --------->   AQUI SE CUMPLE EL PRINCIPIO DE SUSTITUCION

        /*
         * Aquí, la variable ⁠ carrito ⁠ es de tipo ⁠ CarritoDeCompras ⁠, pero podemos agregar tanto objetos de tipo 
         * ⁠ Libro ⁠ como de tipo ⁠ Electrónico ⁠ al carrito. Esto es posible porque ⁠ Libro ⁠ y ⁠ Electrónico ⁠ son 
         * subclases de ⁠ Producto ⁠, y el método ⁠ agregarProducto ⁠ espera un objeto de tipo ⁠ Producto ⁠.
         * 
         */
        
        
        System.out.println("Contenido del carrito:");
        for (Producto producto : carrito.getProductos()) { 													
            System.out.printf("Producto: %s - Precio: $%.2f%n", producto.getNombre(), producto.getPrecio());
            if (producto instanceof Libro) {		 														  														
                Libro libroProducto = (Libro) producto; 													 
                System.out.println("Autor: " + libroProducto.getAutor()); 									
            } else if (producto instanceof Electronico) { 													 
                Electronico electronicoProducto = (Electronico) producto; 									 
                System.out.println("Marca: " + electronicoProducto.getMarca()); 							 
            } 																								
        } 																									
        
        /*
         * En este bucle, iteramos sobre la lista de productos del carrito. Aunque la lista contiene tanto objetos 
         * ⁠ Libro ⁠ como ⁠ Electrónico ⁠, podemos tratarlos todos como si fueran de tipo ⁠ Producto ⁠ gracias a 
         * la herencia.
         * 
         */
    }
}