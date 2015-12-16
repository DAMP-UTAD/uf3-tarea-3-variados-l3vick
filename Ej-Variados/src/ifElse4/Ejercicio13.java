package ifElse4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el sueldo");
		int sueldo = scan.nextInt();
		System.out.println("Introduce los años");
		int años = scan.nextInt();
		int aumento20 = ((sueldo *20) / 100)+ sueldo;
		int aumento5 = ((sueldo *5) / 100)+ sueldo;


		if ( (sueldo < 500) && (años >= 10)){
			System.out.println("Se aumenta el salario a " + aumento20);
		} else if ((sueldo < 500) && (años < 10)) {
			System.out.println("Se aumenta el salario a " + aumento5);
		} else {
			System.out.println("El salario es " +sueldo);
		}
	}
}