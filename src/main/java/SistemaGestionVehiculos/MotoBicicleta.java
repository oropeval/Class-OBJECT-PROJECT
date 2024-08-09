package SistemaGestionVehiculos;

public class MotoBicicleta extends vehiculo{
private int cilindrado;

public MotoBicicleta(String marca, String modelo, int ano, int cilindrado) {
	super (marca,modelo,ano);
	this.cilindrado = cilindrado;
}

@Override
public double calcularConsumo() {
	return 4.5;
	
}

@Override
public String getInformacionBasica() {
	return super.getInformacionBasica() + "cilindrada" + cilindrado + "cc";
	
}



}
