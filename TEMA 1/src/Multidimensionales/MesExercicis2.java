package Multidimensionales;
import java.util.*;

public class MesExercicis2 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		//Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrarla.
		
		int marco[][] = new int [8][6];
		
		for(int i = 0; i < 8; i++) {
			marco[i][0] = 1;
			
			marco[i][5] = 1;
			
			for(int a = 0; a < marco[0].length; a++) {
				marco[0][a] = 1;
				marco[7][a] = 1;
				System.out.print(marco[i][a] + " ");
			}
			System.out.println();
		}
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
