package for2;

import java.util.Scanner;

public class Ejercicio29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int equilatero = 0;
		int isosceles = 0;
		int escaleno = 0;
		int lado1, lado2, lado3;
		System.out.println("Introduzca la cantidad de triangulos");
		int cantTri = scan.nextInt();
		for (int i = 0; cantTri > i; i++) {
			System.out.println("Introduzca lado1");
			lado1 = scan.nextInt();
			System.out.println("Introduzca lado2");
			lado2 = scan.nextInt();
			System.out.println("Introduzca lado3");
			lado3 = scan.nextInt();
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Es un triangulo equil�tero");
				equilatero++;
			} else if (lado1 == lado2 && lado3 != lado2 || lado1 == lado3
					&& lado2 != lado1 || lado2 == lado3 && lado1 != lado2) {
				System.out.println("Es un triangulo is�sceles");
				isosceles++;
			} else {
				System.out.println("Es un triangulo escaleno");
				escaleno++;
			}

		}
		System.out.println("Triangulos equil�teros = " + equilatero
				+ " Triangulos is�sceles = " + isosceles
				+ " Triangulos escalenos =");
		if (equilatero < isosceles && equilatero < escaleno) {
			System.out.println("Equilatero tiene menor cantidad");
		} else if (isosceles < equilatero && isosceles < escaleno) {
			System.out.println("Is�sceles tiene menor cantidad");
		} else if (escaleno < equilatero && escaleno < isosceles) {
			System.out.println("Escaleno tiene menor cantidad");
		} else if (escaleno == equilatero && escaleno < isosceles) {
			System.out.println("Escaleno y equil�tero tienen mayor cantidad");
		} else if (equilatero == isosceles && equilatero < escaleno) {
			System.out.println("Equilatero e is�sceles tienen menor cantidad");
		} else if (isosceles == escaleno && isosceles < equilatero) {
			System.out.println("Escaleno e is�sceles tienen menor cantidad");
		} else {
			System.out
					.println("Hay la misma cantidad de escalenos, equil�teros e is�sceles");
		}

	}
}
