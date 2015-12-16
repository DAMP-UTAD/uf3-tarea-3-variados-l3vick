package while2;

import java.util.Scanner;

public class Ejercicio20 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int tabla1 = 0;
		int tabla2 = 0;
		int num = 15;
		
		while (num > 0){
			System.out.println("Introduce un numero para tabla1");
			int numT1 = scan.nextInt();
			tabla1 = tabla1 + numT1;
			num--;
		}
		num = 15 ;
		while (num > 0){
			System.out.println("Introduce un numero para tabla2");
			int numT2 = scan.nextInt();
			tabla2 = tabla2 + numT2;
			num--;
		}
		if (tabla1>tabla2){
			System.out.println("Lista 1 es mayor = " +tabla1);
		} else if (tabla2 > tabla1){
			System.out.println("Lista 2 es mayor = " +tabla2);
		} else {
			System.out.println("Las listas son iguales");
		}
	}
}
