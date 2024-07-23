package com.example.Class.CUENTA.BANCARIA;

public class Main2 {
	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria(123456789, 1000.0, "FABI");
		System.out.println("numCuenta" + cuenta1.getnumCuenta());
		System.out.println("saldo $" + cuenta1.getSaldo());
		System.out.println("Titular:" + cuenta1.getNombreTitular());
		
		//depositar dinero
		cuenta1.depositar(500);
		//consultar saldo despues de deposito
		System.out.println("\nSaldo despues del deposito: $" + cuenta1.getSaldo());
		//retirar dinero
		cuenta1.retirar(400);
		//consultar saldo
System.out.println("\nSaldo despues del retiro: $" + cuenta1.getSaldo());	
		
		
		
	}
}
