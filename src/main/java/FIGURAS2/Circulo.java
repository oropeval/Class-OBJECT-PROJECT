package FIGURAS2;

public class Circulo extends FiguraGeometrica {
	
private double radio;
		
//Sobreescritura del constructor
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
@Override
public double calcularArea() {
	return Math.PI * Math.pow(radio, 2);
	
}
@Override
public void mostrarInformacion() {
	super.mostrarInformacion(); 
	System.out.println("soy un circulo de radio " + radio);
	
}

	
	
}
