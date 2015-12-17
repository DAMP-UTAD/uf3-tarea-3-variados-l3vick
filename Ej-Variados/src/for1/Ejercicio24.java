package for1;

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
		// inicializacion
		int cantidad12 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de triangulos");
		int cantTri = scan.nextInt();
		int base,altura;
		float area;
//		Proceso
		/*
		 * 1.-Pedir cantidad de triangulos 
		 * 2.- Pedir base y altura de cada triangulo 
		 * 3.-calcular y mostrar area (base*altura/2)
		 * 4.- llevar la cuanta de los mayores de 12
		 * 5.-Mostrar cantidad
		 */
		for (int i = 0; i < cantTri; i++){
			System.out.println("Introduzca la base");
			base = scan.nextInt();
			System.out.println("Introduzca la altura");
			altura = scan.nextInt();
			area = base*altura/2f;
			System.out.println("El área del triangulo es: " + area+ " su altura es " + altura + " y su base es " + base);
		if	(area > 12)	{
			cantidad12++;
		}
		}

		
//		Presentación.
		System.out.println("La cantidad de triangulos con area mayor que 12 es: " + cantidad12);
	}
}
