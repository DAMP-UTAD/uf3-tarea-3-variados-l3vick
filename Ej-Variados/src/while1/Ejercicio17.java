package while1;
	
import java.util.Scanner;


public class Ejercicio17 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int contador = 0;
		int medio = 0;
		int mayor = 0;
		int sueldo = 0;
		System.out.println("Introduce un numero de empleados");
		int num = scan.nextInt ();
		
		while (num >0){
			System.out.println("introduce el salario del empleado");
			int salario = scan.nextInt();
			sueldo = sueldo + salario;
			num--; contador++;

			if (salario>=100 && salario <=300){
				medio++;
			} else if ( salario >= 301){
				mayor++;
			
		}
			
			
			}System.out.println("Hay " + mayor+ " empleados que cobran mas de 300 euros");
			System.out.println("Hay " + medio + " empleados que cobran entre 100 y 300 euros");
			System.out.println("La empresa tiene un gasto de " + sueldo );

			
		
		
	}
	
}