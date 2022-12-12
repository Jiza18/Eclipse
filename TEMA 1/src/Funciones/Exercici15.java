package Funciones;
import java.util.*;

public class Exercici15 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
	Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
	array y otra que calcule la media de un array.*/
	
	public static int suma(int vector[]) {
		
		int suma = 0;
		
		for(int i = 0; i < vector.length; i++) {
			
			suma += vector[i];
			
		}
		return suma;
		
	}
	
	public static int media(int vector[]) {
		
		int media = 0;
		
		int suma = 0;
		
		for(int i = 0; i < vector.length; i++) {
			
			suma += vector[i];
			
		}
		
		media = suma/vector.length;
		
		return media;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int array[] = new int [100];
		
		int x = 1;
		
		int suma;
		
		int media;
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = x;
			x++;
			
		}
		
		suma = suma(array);
		media = media(array);
		
		System.out.println("La suma del vector es: " + suma);
		System.out.println("La media del vector es: " + media);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
