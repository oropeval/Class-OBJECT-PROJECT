package SistemaEmplep;

public class Main {
public static void main(String[] args) {
	EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Juan", "Perez", 15, 160);
	EmpleadoPorSueldo empleado2 = new EmpleadoPorSueldo("Maria", "Lopez", 3800);
	
	System.out.println("el salario de" + empleado1.getNombreCompleto() + " es: $" + empleado1.calcularSalario());
	System.out.println("el salario de" + empleado2.getNombreCompleto() + " es: $" + empleado2.calcularSalario());
	
	
}
}
