package com.example.Class.CUENTA.BANCARIA;

public class CuentaBancaria {

	private int numCuenta;
	private double saldo;
	private String nombreTitular;
	
	public CuentaBancaria(int numCuenta, double saldoInicial, String nombreTitular) {
	
	this.saldo = saldoInicial;
	this.numCuenta = numCuenta;
	this.nombreTitular = nombreTitular;
	
	}
	
public int getnumCuenta() {
  return numCuenta;  

}
public double getSaldo() {
	return saldo;
}
public String getNombreTitular() {
	
	return nombreTitular;
	
}
//metodo para agregar saldo
public void depositar(double monto) {
	if(monto > 0) {
		saldo += monto;
		System.out.println("se ha depositado $" + monto + "en la cuenta" + numCuenta);
	} else {
		System.out.print("el error: el mmonto ha depositar debe ser mayor a 0");
		
	}
	
}

//metodo para retirar dinero

public void retirar(double monto) {
	if(monto > 0 && saldo >= monto) {
		saldo -= monto;
		System.out.println("Se ha retirado dinero $" + monto + "de la cuenta" + numCuenta);
	}
	
	
	
}




}
