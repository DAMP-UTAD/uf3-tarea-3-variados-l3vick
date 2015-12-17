package for2;

import java.util.Scanner;

public class Ejercicio35 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Introduce el valor inicial: ");
	int num = scan.nextInt();
	System.out.println();
	String strNum;
	for (int i = 1; i <=5; i++){
		for (int j = 0; j< 5; j++){
			strNum = num + " ";
			if (num<=10)
				strNum = num + " ";
			System.out.print(strNum);
			num++;
		}
		System.out.println();
	}
	
}
}
