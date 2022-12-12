package Introduccion;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce un numero a:");
		
		double a=entrada.nextDouble();
		
		System.out.println("Introdece un numero b:");
		
		double b=entrada.nextDouble();
		
		double suma=a+b, resta=a-b, produ=a*b;
		
		System.out.println("a+b=" +suma);
		System.out.println("a-b=" +resta);
		System.out.println("a*b=" +produ);
		
		if (b==0) {
			
			System.out.println("a/b Error division por cero");
		}
		else {
			double div=a/b;
			System.out.println("a/b=" +div);
		}
	}

}
