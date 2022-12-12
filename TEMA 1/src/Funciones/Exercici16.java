package Funciones;
import java.util.*;

public class Exercici16 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
	valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
	valores aleatorios.*/
	
	public static void rellenar(int vector[]) {
		
		for(int i = 0; i < vector.length; i++) {
			
			vector[i] = (int) (1 + Math.random() * (100-1 + 1) );
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del vector: ");
		
		int x = entrada.nextInt();
		
		int array[] = new int [x];
		
		rellenar(array);
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("Vector [" + i + "]:" + array[i]);
			
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
