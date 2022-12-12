package Multidimensionales;
import java.util.*;

public class Exercici4 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
		1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
		programa mostrará la nota mínima, máxima y media de cada alumno.*/
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		int maxima = -1000;
		int minima = 1000;
		int media = 0;
		int suma = 0;
		
		int matriz[][] = new int [4][5];
		
		for(int i = 0; i < matriz.length; i++) {
			
			maxima = -100000;
			minima = 100000;
			media = 0;
			suma = 0;
			
			System.out.println("--------");
			System.out.println("ALUMNO " + (i+1));
			System.out.println("--------");
			
			for(int a = 0; a < matriz[0].length; a++) {
				
				System.out.print("Introduce la nota del alumno " + (i+1) + ", de la asignatura " + (a+1) + ":");
				matriz[i][a] = entrada.nextInt();
				
				if(matriz[i][a] > maxima) {
					maxima = matriz[i][a];
				}
				if(matriz[i][a] < minima) {
					minima = matriz[i][a];
				}
				
				suma += matriz[i][a];
			}
			media = suma / 5;
			
			System.out.println("La nota maxima del alumno " + (i+1) + " es: " + maxima);
			System.out.println("La nota minima del alumno " + (i+1) + " es: " + minima);
			System.out.println("La nota media del alumno " + (i+1) + " es: " + media);
			
		}
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
