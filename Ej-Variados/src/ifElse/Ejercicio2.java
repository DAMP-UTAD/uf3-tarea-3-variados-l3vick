package ifElse;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una nota");
		float not1 = scan.nextInt();
		System.out.println("Introduce otra nota");
		float not2 = scan.nextInt();
		System.out.println("Introduce otra nota");
		float not3 = scan.nextInt();
		if (((not1 + not2 + not3) / 3) >=7) {
			System.out.println("Promocionado");
		} else {
			System.out.println("No promocionado");
		}
	}

}