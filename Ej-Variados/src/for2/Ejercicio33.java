package for2;

import java.util.Scanner;

public class Ejercicio33 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Introduzca un numero: ");
	int contador = scan.nextInt(), totalPrimos=0;
	for (int i = contador; i >1; i--){
		boolean isPrimo = true;
		for (int j = 2; j < i; j++){
			if (i%j == 0){
				isPrimo = false;
			}
		}if (isPrimo){
			totalPrimos++;
		}
	}System.out.println("La cantidad de primos es: " + totalPrimos);
}
}
