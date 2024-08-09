package FIGURAS2;

public abstract class FiguraGeometrica {
private String color;



//constructor
public FiguraGeometrica(String Color) {
this.color = color;

}

public abstract double calcularArea();
public String getColor() {
	return color;
	
}

public void mostrarInformacion() {
	System.out.println("soy una figura geometrica de color" + color);
}


}
