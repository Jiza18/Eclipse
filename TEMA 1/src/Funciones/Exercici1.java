package Funciones;
import java.util.*;

public class Exercici1 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
	resultado de multiplicarlos.*/
	
	public static double multiplicar(double a, double b) {
		
		double multi = 0;
		
		multi = a * b;
		
		return multi;
		
	}
	
	public static void main(String[] args) {
		
		double producto = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el numero x: ");
		
		double x = entrada.nextDouble();
		
		System.out.print("Introduce el numero y: ");
		
		double y = entrada.nextDouble();
		
		producto = multiplicar(x,y);
		
		System.out.print("El resultado de la multiplicación es: " + producto);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
