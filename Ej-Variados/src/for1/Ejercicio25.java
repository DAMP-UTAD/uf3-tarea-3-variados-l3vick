package for1;

import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	int sumaT = 0;
	int suma = 0;
	int contador = 0;

	for (int num = 1; num <= 10; num++) {
		System.out.println("Introduce un numero");
		suma = scan.nextInt();
		contador++;
		if (contador > 5)
		sumaT = sumaT + suma;
	}
	System.out.println("la suma de los ultimos 5 numeros es: " +sumaT);

}
}
