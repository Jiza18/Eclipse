package Introduccion;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		
		int num1=entrada.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		
		int num2=entrada.nextInt();
		
		System.out.println("Introduce el tercer numero:");
		
		int num3=entrada.nextInt();
		
		if (num1>num2) {
			
		if (num1>num3) {
			System.out.println("El mayor es "+num1);
			
		if (num1<num3) {
			System.out.println("El mayor es "+num3);
		}
		
		}
		
		}
		else if (num2>num3) {
			System.out.println("El mayor es "+num2);
			
		}
		else {
			System.out.println("El mayor es "+num3);
		}
	}

}
