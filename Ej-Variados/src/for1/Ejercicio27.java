package for1;

import java.util.Scanner;

public class Ejercicio27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contador = 0;
		System.out.println("Introduce el numero deseado a multiplicar");
		int numero = scan.nextInt();
		for (int num = 1; num <= 12; num++) {
			contador++;
			while (contador > 0){
				System.out.println(numero +" x " +num +" = "+ (numero * num));
				contador--; 
			}
		}

	}
}