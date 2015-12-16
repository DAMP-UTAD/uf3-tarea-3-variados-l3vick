package ifElse3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce el dia y el mes en formato decimal");
		System.out.println("Introduce el dia");
		int num1 = scan.nextInt();
		System.out.println("Introduce el mes");
		int num2 = scan.nextInt();
		int fecha;
		if ( (num1 == 25) && (num2 == 12)){
			System.out.println("Es el dia de Navidad");
		} else{
			System.out.println("No es navidad");
		}
	}
}