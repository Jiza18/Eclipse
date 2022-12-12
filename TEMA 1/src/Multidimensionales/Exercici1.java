package Multidimensionales;
import java.util.*;

public class Exercici1 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al
		25 y luego muestre la matriz por pantalla.*/
		
		
		int matriz[][] = new int [5][5];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int a = 0; a < matriz[0].length; a++) {
				
				matriz[i][a] = (i*matriz.length)+(a+1);
				
				System.out.print(matriz[i][a]+" ");
				
			}
			System.out.println("");
			
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
