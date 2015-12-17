package for2;

import java.util.Scanner;

public class Ejercicio34 {
public static void main(String[] args) {
	Scanner scan = new Scanner  (System.in);
	System.out.println("Introduce el lado:");
	int altura = scan.nextInt();
	for ( int i = 1; i <= altura; i++){
		for (int j = 1; j<= i; j++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
