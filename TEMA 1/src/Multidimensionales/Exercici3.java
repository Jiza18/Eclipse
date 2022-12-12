package Multidimensionales;
import java.util.*;

public class Exercici3 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
		introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer
		la matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
		menores que cero y cuántos son igual a cero.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int mayores = 0; int menores = 0; int cero = 0;
		
		System.out.print("Introduce la cantidad de filas de la matriz: ");
		
		int f = entrada.nextInt();
		
		System.out.print("Introduce la cantidad de columnas de la matriz: ");
		
		int c = entrada.nextInt();
		
		int matriz[][] = new int [f][c];
		
		for(int i = 0; i < f; i++) {
			
			for(int a = 0; a < c; a++ ) {
				
				System.out.println("Introduce el valor de la fila: " + (i + 1) + " Columna: " + (a+1));
				
				matriz[i][a] = entrada.nextInt();
				
				if(matriz[i][a] < 0) {
					menores++;
				}
				else if(matriz[i][a] > 0) {
					mayores++;
				}
				else {
					cero++;
				}
				
			}
			
		}
		
		System.out.println("Hay " + mayores + " mayor/es que cero");
		System.out.println("Hay " + menores + " menor/es que cero");
		System.out.println("Hay " + cero + " igual/es a cero");
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
