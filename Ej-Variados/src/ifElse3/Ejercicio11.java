package ifElse3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int num1 = scan.nextInt();
		System.out.println("Introduce un n�mero");
		int num2 = scan.nextInt();
		System.out.println("Introduce un n�mero");
		int num3 = scan.nextInt();

		if ( (num1 < 10) || (num2 < 10) || (num3 < 10)){
			System.out.println("Alguno de los n�meros es menor a 10");
		} else {
			System.out.println("Ning�n numero es menor a 10");
		}
	}
}