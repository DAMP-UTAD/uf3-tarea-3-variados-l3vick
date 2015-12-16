package while2;

import java.util.Scanner;

public class Ejercicio21 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int par = 0;
		int impar = 0;
		System.out.println("Cantidad de numeros a introducir");
		int numeros = scan.nextInt(); 
		while (numeros >0){
			System.out.println("introduce un numero");
			int num = scan.nextInt();
			numeros--;
			if  (num % 2 == 0){
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Hay " +par + " numeros pares");
		System.out.println("Hay " +impar + " numeros impares");
		
}
}
