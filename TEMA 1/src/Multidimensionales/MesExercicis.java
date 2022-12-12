package Multidimensionales;
import java.util.*;

public class MesExercicis {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		//Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0. Mostrarla.
		
		Scanner entrada = new Scanner(System.in);
		
		int tabla[][] = new int [7][7];
		
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i][i] = 1;
			for(int a = 0; a < tabla[0].length; a++) {
				System.out.print(tabla[i][a] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
			
	}

}
