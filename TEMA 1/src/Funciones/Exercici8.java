package Funciones;
import java .util.Scanner;

public class Exercici8 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
	productorio de 1 a N y el valor intermedio entre 1 y N.*/
	
	public static int suma1aN(int n) {
		
		int suma = 0;
		
		for(int i = 1; i <= n; i++) {
			
			suma += i;
			
		}
		return suma;
		
	}
	
	public static int producto(int n) {
		
		int producto = 1;
		
		for(int i = 1; i <= n; i++) {
			
			producto *= i;
			
		}
		return producto;
		
	}
	
	public static double intermedio(int n) {
		
		int inter = n/2;
		
		return inter;
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un el valor de N:");
		
		int n = entrada.nextInt();
		
		System.out.println("La suma de los numeros comprendidos de 1 a " + n + " es: " + suma1aN(n));
		System.out.println("El producto de los numeros comprendidos de 1 a " + n + " es: " + producto(n));
		System.out.println("El numero intermedio entre 1 y " + n + " es: " + intermedio(n));
		System.out.println();
		
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
		
	}

}
