package ifElse2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num1 = scan.nextInt();
		if (num1 > 0){
			System.out.println("El número es positivo");
		} else if (num1 < 0){
			System.out.println("el número es negativo");
		} else {
			System.out.println("El número es nulo");
		}
}
}	