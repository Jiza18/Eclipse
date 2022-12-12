package Introduccion;

import java.util.Scanner;

public class Ejercicio03 {
	
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Introduce el lado:");
		
		double x=entrada.nextDouble();
		double area=x*x;
		
		
		
		
		System.out.println("El area del cuadrado es:" + area);
	}

}
