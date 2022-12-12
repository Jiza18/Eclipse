package Funciones;
import java.util.*;

public class Exercici17 {
	
	//Jose Miguel Izarra
	
	/* Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
	para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
	divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
	pasándole un número entero devuelva si es primo o no.*/
	
	public static void primo(int a) {
		
		boolean primo = true;
		
		if(a != 0) {
			for(int i = 2; i < a; i++) {
				
				if(a%i==0) {
					primo = false;
				}
				
			}
			if(primo) {
				System.out.println("Es primo");
			}
			else {
				System.out.println("No es primo");
			}	
		}
		else {
			System.out.println("Hasta pronto!");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = 0;
		
		do {
			System.out.print("Introduce el numero a evaluar o 0 para salir:");
			
			x = entrada.nextInt();
			
			primo(x);
		}
		while(x!=0);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
