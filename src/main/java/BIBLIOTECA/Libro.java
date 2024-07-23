package BIBLIOTECA;

public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	private boolean disponible;
	
	
	
	//constructor
	public Libro(int ISBN, String titulo, String autor){
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = true;
	
	}
	public int getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		
	return autor;
	}
	public boolean isDisponible() {
		return disponible;
	}
	
	public void setDisponible(boolean nuevoDisponible){
		this.disponible = nuevoDisponible;
	}
	public void prestar() {
		if(disponible) {
			
			disponible = false;
			System.out.println("El libro" + titulo + "ha sido prestado");
			
		}else {
			System.out.println( "el libro" + titulo + "no esta disponible para prestamo ");
			
			
		}
		
		
	}
public void devolver() {
	
	if (!disponible) {
		
		disponible = true;
		System.out.println("El libro" + titulo + "ha sido devuelto");
		
	}else {
		
		System.out.println("El libro" + titulo + "ya esta disponiblee");
	}
}
	
}

