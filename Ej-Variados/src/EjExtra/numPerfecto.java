package EjExtra;

import java.util.Scanner;

public class numPerfecto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumaDivisores = 0;
		System.out.print("Por favor, introduzca un numero natural: ");
		int numero = scanner.nextInt();
		scanner.close();
		for (int a = 1; a < numero; a++) {
			if (numero % a == 0) {
				sumaDivisores = sumaDivisores + a;
			}
		}
		if (numero == sumaDivisores) {
			System.out.println("El numero " + numero + " es perfecto!");
		} else {
			System.out.println("El numero " + numero + " NO es perfecto!");
		}
	}
}
