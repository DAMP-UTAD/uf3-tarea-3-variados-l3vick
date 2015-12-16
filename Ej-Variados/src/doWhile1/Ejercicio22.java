package doWhile1;

import java.util.Scanner;

public class Ejercicio22 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num;
		int resultado=0;
		do{
			System.out.println("Introduce un numero");
			num = scan.nextInt();
			resultado = (resultado + num);
		} while (num!=9999);
		
		if (resultado >9999){
			System.out.println("El valor acumulado es " + (resultado - 9999) + " y es mayor a 0");
		} else if (resultado < 9999){
			System.out.println("El valor acumulado es " + (resultado - 9999) + " y es menor a 0");
		} else {
			System.out.println("El valor acumulado es " + (resultado - 9999) + " y es igual a 0");
		}
		
}
}
