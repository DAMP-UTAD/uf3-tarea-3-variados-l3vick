package while1;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner scan = new Scanner(System.in);
	static int num = 1;
	int mayor = 0;
	int menor = 0;
	
	public void notas (){
		System.out.println("Introduce una nota");
		int nota = scan.nextInt();
		if(nota >= 7){
			mayor++;
		}
		else {
			menor++;
		}

	}
	
	public static void main(String[] args) {
		Ejercicio15 Evaluacion = new Ejercicio15 ();
		while (num <= 10){
		Evaluacion.notas();
		num++;
		}System.out.println("Hay " +Evaluacion.mayor + " notas por encima o igual a 7");
		System.out.println("Hay " +Evaluacion.menor + "notas por debajo de 7");
}
}
