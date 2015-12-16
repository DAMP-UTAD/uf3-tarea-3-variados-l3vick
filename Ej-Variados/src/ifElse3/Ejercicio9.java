package ifElse3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1 = scan.nextInt();
		System.out.println("Introduce un número");
		int num2 = scan.nextInt();
		System.out.println("Introduce un número");
		int num3 = scan.nextInt();
		int operacion = (num1 + num2) * num3 ;
		if ( (num1 == num2) && (num1 == num3)){
			System.out.println(operacion);
		} else {
			System.out.println("-ERROR-");
		}
	}
}