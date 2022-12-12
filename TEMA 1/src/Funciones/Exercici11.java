package Funciones;
import java.util.*;

public class Exercici11 {
	
	//Jose Miguel Izarra
	
	/*Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
	Para ello implementa una función que reciba como parámetro un número entero y muestre por
	pantalla la tabla de multiplicar de dicho número.*/
	
	public static void tabla(int n) {
		
		int producto = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			producto = n*i;
			
			System.out.println("[ " + n + " * " + i + " ]= " + producto);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el numero: ");
		
		int n = entrada.nextInt();
		
		tabla(n);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra");
		
	}

}
