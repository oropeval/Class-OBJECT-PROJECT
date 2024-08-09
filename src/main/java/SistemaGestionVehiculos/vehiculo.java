package SistemaGestionVehiculos;

public abstract class vehiculo {
	private String marca;
	private String modelo;
	private int ano;

	public vehiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		
	}
	public abstract double calcularConsumo();//metodo abstracto para calcular el consumo
	
	public String getInformacionBasica() {
		return "Marca:" + marca + "modelo" + modelo + "ano: " + ano;
		
	}
	
	
	
	
	
}
