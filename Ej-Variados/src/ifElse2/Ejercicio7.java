package ifElse2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la cantidad de preguntas");
		int num1 = scan.nextInt();
		System.out.println("Introduce la cantidad de respuestas correctas");
		int num2 = scan.nextInt();
		int porcentaje = (num2 * 100) /num1;
		if ( porcentaje >= 90){
			System.out.println("Nivel Máximo");
		} else if ( porcentaje >= 75){
			System.out.println("Nivel Medio");
		} else if (porcentaje >= 50){
			System.out.println("Nivel Regular");
		} else {
			System.out.println("Fuera de Nivel");
		}
	}
}