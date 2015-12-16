package while1;
	
import java.util.Scanner;

public class Ejercicio16 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un numero de alturas");
		int num = scan.nextInt ();
		int contador = 0;
		float altura = 0;
		
		while (num > 0) {
			System.out.println("Introduce una altura");
			altura = altura + scan.nextInt ();
			num--; contador++;
		} System.out.println("La altura media es: " + (altura / contador));
			
		
	}
	
}
