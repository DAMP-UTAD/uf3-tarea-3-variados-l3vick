package ifElse2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un n�mero entero");
		int num1 = scan.nextInt();
		if (num1 > 0){
			System.out.println("El n�mero es positivo");
		} else if (num1 < 0){
			System.out.println("el n�mero es negativo");
		} else {
			System.out.println("El n�mero es nulo");
		}
}
}	