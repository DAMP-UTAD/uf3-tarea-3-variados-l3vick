package ifElse4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int num1 = scan.nextInt();
		System.out.println("Introduce un n�mero");
		int num2 = scan.nextInt();
		System.out.println("Introduce un n�mero");
		int num3 = scan.nextInt();

		if (( num1 > num2) && (num3 > num1)){
			System.out.println("el numero mayor es " + num3 + " y el n�mero menor es " + num2);
		} else if (( num2 > num1) && (num3 > num2)){
			System.out.println("el numero mayor es " + num3 + " y el n�mero menor es " + num1);
		} else if (( num3 > num1) && (num2 > num3)){
			System.out.println("el numero mayor es " + num2+ " y el n�mero menor es " + num1);
		} else if (( num1 > num2) && (num2 > num3)){
			System.out.println("el numero mayor es " + num1+ " y el n�mero menor es " + num3);
		} else if (( num3 > num2) && (num1 > num3)){
			System.out.println("el numero mayor es " + num1+ " y el n�mero menor es " + num2);
		} else if (( num2 > num1) && (num2 > num2)){
			System.out.println("el numero mayor es " + num2+ " y el n�mero menor es " + num3);
		}
}
}