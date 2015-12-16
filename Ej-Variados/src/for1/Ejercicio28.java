package for1;

import java.util.Scanner;

public class Ejercicio28 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int cuadr1 = 0;
	int cuadr2 = 0;
	int cuadr3 = 0;
	int cuadr4 = 0;
	int numCor;

	System.out.println("Ingrese la cantidad de coordenadas a introducir");
	numCor = scan.nextInt();
	for (int n=1; n <= numCor; n++){
		System.out.println("ingresa la cordenada X");
		int x = scan.nextInt();
		System.out.println("ingresa la cordenada Y");
		int y = scan.nextInt();
		if (x > 0 && y > 0){
			cuadr1++;
		} else if (x > 0 && y < 0){
			cuadr2++;
		} else if (x < 0 && y > 0){
			cuadr3++;			
		} else {
			cuadr4++;
		}
	}
	System.out.println("En el cuadrante 1 se ha/n ingresado "+ cuadr1 + " punto/s");
	System.out.println("En el cuadrante 2 se ha/n ingresado "+ cuadr2 + " punto/s");
	System.out.println("En el cuadrante 3 se ha/n ingresado "+ cuadr3 + " punto/s");
	System.out.println("En el cuadrante 4 se ha/n ingresado "+ cuadr4 + " punto/s");

}
}
