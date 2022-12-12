package Introduccion;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		
		double num1=entrada.nextDouble();
		
		System.out.println("Introduce el segundo numero:");
		
		double num2=entrada.nextDouble();
		
		if (num1>num2) {
			
			System.out.println(num1+" es mayor que "+num2);
			
		}
		
		else if (num1==num2) {
			
			System.out.println(num1+" y "+num2+" son iguales");
			
		}
		
		else {
			System.out.println(num2+" es mayor que "+num1);
		}
	}
	

}
