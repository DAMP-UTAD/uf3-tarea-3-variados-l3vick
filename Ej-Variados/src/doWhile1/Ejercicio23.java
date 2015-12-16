package doWhile1;

import java.util.Scanner;

public class Ejercicio23 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int saldoAcreedor = 0;
		int numCuenta;
		int saldoActual;
		do{
			System.out.println("Introduce el saldo");
			saldoActual = scan.nextInt();
			System.out.println("Introduce un numero de cuenta");
			numCuenta = scan.nextInt();
			if (saldoActual > 0 && numCuenta > 0){
				System.out.println("Acreedor");
				saldoAcreedor = saldoAcreedor + saldoActual;
				
			} else if (saldoActual < 0 && numCuenta > 0){
				System.out.println("Deudor");
			} else if (saldoActual == 0 && numCuenta > 0){
				System.out.println("Nulo");
			}
			
		} while (numCuenta > 0);
		System.out.println("La suma del saldo de los acreedores es "+ saldoAcreedor);

	
}
}