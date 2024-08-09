package SistemaEmplep;

public class EmpleadoPorSueldo extends Empleado {
public EmpleadoPorSueldo(String nombre, String apellido, double salarioBase) {
	super(nombre, apellido, salarioBase);
	
}
@Override
public double calcularSalario() {
	return salarioBase;
}



}
