package ifElse;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		float num1 = scan.nextInt();
		System.out.println("Introduce otro número");
		float num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println("La suma es: " + (num1 + num2)
					+ " y la diferencia es: " + (num1 - num2));
		} else {
			System.out.println("El producto es: " + (num1 * num2)
					+ " y la division es: " + (num1 / num2));
		}
	}

}