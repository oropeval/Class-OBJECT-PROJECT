package SistemaEmplep;

public class EmpleadoPorHoras extends Empleado{
	private double horasTrabajadas;

	public EmpleadoPorHoras(String nombre, String apellido, double salarioPorHora, double horasTrabajadas) {
		super(nombre, apellido, salarioPorHora);
		this.horasTrabajadas = horasTrabajadas;
		
	}
	
	@Override
	public double calcularSalario() {
		return horasTrabajadas * super.salarioBase;
	}
}
