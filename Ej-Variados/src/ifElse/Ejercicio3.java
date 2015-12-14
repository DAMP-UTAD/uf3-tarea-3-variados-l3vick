package ifElse;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un dígito");
		int num1 = scan.nextInt();
	
		if ((num1 / 10) > 1){
			System.out.println("El número tiene dos dígitos");
		} else {
			System.out.println("El número tiene 1 dígito");
		}
	}

}