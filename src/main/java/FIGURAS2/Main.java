package FIGURAS2;

public class Main {
	public static void main(String[] args) {
		//instanciar = crear nuevoObjeto
		Circulo circulo = new Circulo("rojo", 5);
		Rectangulo rectangulo = new Rectangulo("azul", 4,3);
		
		circulo.mostrarInformacion();
		System.out.println("Es el area del circulo es " + circulo.calcularArea());
		
		circulo.mostrarInformacion();
		System.out.println("Es el area del rectangulo es " + rectangulo.calcularArea());
		
	}
}
