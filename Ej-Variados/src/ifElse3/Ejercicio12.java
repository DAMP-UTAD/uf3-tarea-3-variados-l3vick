package ifElse3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la coordenada de X");
		int numx = scan.nextInt();
		System.out.println("Introduce la coordenada de Y");
		int numy = scan.nextInt();


		if ( (numx > 0) && (numy > 0)){
			System.out.println("1º Cuadrante");
		} else if ((numx < 0) && (numy >0)) {
			System.out.println("2º Cuadrante");
		} else if ((numx < 0) && (numy < 0)) {
			System.out.println("3º Cuadrante");
		} else {
			System.out.println("4º Cuadrante");
		}
	}
}