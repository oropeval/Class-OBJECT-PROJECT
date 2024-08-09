package FIGURAS2;

public class Rectangulo extends FiguraGeometrica {
private double base;
private double altura;

public Rectangulo(String color, double base, double altura) {
	super(color);
	this.altura = altura;
	this.base = base;

}
@Override
public double calcularArea() {
	return base * altura;
}

@Override
public void mostrarInformacion() {
	super.mostrarInformacion();
	System.out.println("Soy un rectangulo con base " + base + "y altura " + altura);
	
	
}

}
