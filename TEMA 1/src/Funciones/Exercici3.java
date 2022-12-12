package Funciones;
import java.util.*;

public class Exercici3 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es
	el mínimo.*/
	
	public static int minimo(int a,int b) {
		
		int min = 0;
				
		if(a < b) {
			min = a;
		}
		else {
			min = b;
		}
		return min;
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		
		int a = entrada.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		
		int b = entrada.nextInt();
		
		int min = minimo(a,b);
		
		System.out.print("El menor entre los dos numeros es: " + min);
		
	}

}
