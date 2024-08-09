package SistemaGestionVehiculos;

public class Auto extends vehiculo{
	private int cantidadPuertas;
	
	public Auto(String marca, String modelo, int ano, int cantidadPuertas) {
		super(marca,modelo, ano);
		this.cantidadPuertas = cantidadPuertas;
		
	}
	@Override
	public double calcularConsumo() {
		return 8.5;
		
	}

	@Override
	public String getInformacionBasica() {
		return super.getInformacionBasica() + ", PUERTAS: " + cantidadPuertas;
		
	}
	
	
}
