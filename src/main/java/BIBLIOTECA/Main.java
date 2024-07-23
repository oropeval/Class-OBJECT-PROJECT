package BIBLIOTECA;

public class Main {
public static void main(String[] args) {
	
	//crear un libro
	Libro libro1 = new Libro(123456789, "Cien aOS DE soledad", "gabriel garcia marquez");
	System.out.println("ISBN" + libro1.getISBN());
	System.out.println("titulo" + libro1.getTitulo());
	System.out.println("autor" + libro1.getAutor());
	System.out.println("disponibilidad" + libro1.isDisponible());
	
	
	libro1.prestar();
System.out.println("\ndisponible?" + libro1.isDisponible());

libro1.devolver();
libro1.devolver();
System.out.println("\ndisponible?;" + libro1.isDisponible());

libro1.prestar();
System.out.println("\nesDisponible?" + libro1.isDisponible());
libro1.prestar();




}
}
