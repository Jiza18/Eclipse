package Introduccion;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el numero:");
		
		double num=entrada.nextDouble();
		
		if (num>=0) {
			System.out.println("Es positivo");
			
		}
		
		else {
			System.out.println("Es negativo");
		}
	}

}
