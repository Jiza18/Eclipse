package Funciones;
import java.util.*;

public class Exercici20 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función
	que reciba un número entero como parámetro e imprima su tabla de multiplicar.*/
	
	public static void tabla(int n) {
		
		int producto = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			producto = n*i;
			
			System.out.println("[ " + n + " * " + i + " ]= " + producto);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el numero para generar la tabla: ");
		
		int a = entrada.nextInt();
		
		tabla(a);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
