package ifElse;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un d�gito");
		int num1 = scan.nextInt();
	
		if ((num1 / 10) > 1){
			System.out.println("El n�mero tiene dos d�gitos");
		} else {
			System.out.println("El n�mero tiene 1 d�gito");
		}
	}

}