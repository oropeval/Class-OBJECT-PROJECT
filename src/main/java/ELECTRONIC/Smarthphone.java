package ELECTRONIC;

public class Smarthphone extends Producto {
private String sistemaOperativo;
private double pulgadas;



public Smarthphone (String nombre, double precio, String sistemaOperativo, double Pulgadas) {
	super(nombre,precio);
	this.sistemaOperativo = sistemaOperativo;
	this.pulgadas = pulgadas;
	
}
@Override
public String obtenerDescripcion() {
	return "/nSmarthphone:" + nombre + "sistemas operativo" + sistemaOperativo + "pulgadas" + pulgadas;
	
}
public void aplicarDescuento(int antiguedadMeses) {
	//calcular descuento basado en la antiguedad
	double descuento = antiguedadMeses * 0.5; //ejemplo 0.5% por mes
	aplicarDescuento(descuento);
	
	
}

}


