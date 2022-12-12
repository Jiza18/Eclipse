package Introduccion;
import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String args[]) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu edad:");
		
		int edad=entrada.nextInt();
		
		if (edad>=18) {
			
			System.out.println("Eres mayor de edad");
	
		
		}
		else {
			
			System.out.println("No eres mayor de edad");
		}
				
	}

}
