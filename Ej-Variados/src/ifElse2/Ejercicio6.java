package ifElse2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = scan.nextInt();

		if ( num1 < 10){
			System.out.println("El n�mero tiene un d�gito");
		} else if ( num1 < 100){
			System.out.println("El n�mero tiene dos d�gitos");
		} else if (num1 < 1000){
			System.out.println("El n�mero tiene tres d�gitos");
		} else {
			System.out.println("-ERROR-");
		}
	}
}
