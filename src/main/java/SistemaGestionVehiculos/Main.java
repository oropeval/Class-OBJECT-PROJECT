package SistemaGestionVehiculos;

public class Main {

	public static void main(String[] args) {
		Auto auto = new Auto("toyota", " corola ", 2023, 4);
		MotoBicicleta moto = new MotoBicicleta(" Honda ", " CBR600RR ", 2022,600);
		
		
		System.out.println(auto.getInformacionBasica());
		System.out.println("consumo estimado " +auto.calcularConsumo() + " litros/100km");
		System.out.println(moto.getInformacionBasica());
		System.out.println("consumo estimado " + moto.calcularConsumo() + " litros/100km");
	}
	
	
	
}
