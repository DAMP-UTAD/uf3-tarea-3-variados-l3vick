package ifElse3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int num1 = scan.nextInt();
		System.out.println("Introduce un n�mero");
		int num2 = scan.nextInt();
		System.out.println("Introduce un n�mero");
		int num3 = scan.nextInt();

		if ( (num1 < 10) && (num2 < 10) && (num3 < 10)){
			System.out.println("Todos los n�meros son menores a 10");
		} else {
			System.out.println("No todos los n�meros son menores a 10");
		}
	}
}