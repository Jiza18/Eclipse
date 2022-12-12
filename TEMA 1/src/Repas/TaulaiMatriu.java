package Repas;
import java.util.*;

public class TaulaiMatriu {
	public static void main(String[] args) {
		
		
		//Jose Miguel Izarra
		
		//Crea un programa que sume totes les columnes de una matriu i pose els resultats en un vector
		
		Scanner entrada = new Scanner(System.in);
		
		int suma[] = new int [4];
		
		int matriu[][] = new int [4][4];  
		
		for(int i = 0; i < matriu.length; i++) {
			
			for(int a = 0; a < matriu[0].length; a++) {
				
				System.out.print("Introduce el valor de [" + i + "]" + "[" + a + "]: ");
				
				matriu[i][a] = entrada.nextInt();
				
			}
			
		}
		
		for(int i = 0; i < matriu.length; i++) {
			
			for(int a = 0; a < matriu[0].length; a++) {
				
				suma[i] += matriu[a][i];
				
			}
			System.out.println("El resultat de la suma de la columna " + i + " es: " + suma[i]);
			
		}
		
		System.out.println("\nPrograma desarrolado por Jose Miguel Izarra©");
		
	}

}
