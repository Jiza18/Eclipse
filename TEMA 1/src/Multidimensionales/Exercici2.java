package Multidimensionales;
import java.util.*;

public class Exercici2 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
		multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.*/
		
		int matriz[][] = new int [10][10];
		int multi = 1;
		int cont = 1;
		
			for(int i = 0; i < matriz.length; i++) {
			
			for(int a = 0; a < matriz[0].length; a++) {
				
				matriz[i][a] = (cont * multi);
				
				multi++;
				
				System.out.print(matriz[i][a]+" ");
				
			}
			System.out.println("");
			cont++;
			multi = 1;
			
		}
			System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
