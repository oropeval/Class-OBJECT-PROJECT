package SistemaEmplep;

public abstract class Empleado {
private String nombre;
private String apellido;
public double salarioBase;

public Empleado(String nombre, String apellido, double salarioBase) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.salarioBase = salarioBase;
	
}

public abstract double calcularSalario();
public String getNombreCompleto() {
		return nombre + " " + apellido;
		
	}
}


