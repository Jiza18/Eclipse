package Multidimensionales;
import java.util.*;

public class Exercici5 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
		empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
		información de N personas distintas (valor también introducido por teclado). Para cada
		persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
		guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
		género.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int hombres = 0;
		int mujeres = 0;
		int totalhombres = 0;
		int totalmujeres = 0;
		
		System.out.print("Introduce la cantidad de personas: ");
		
		int personas = entrada.nextInt();
		
		int matriz[][] = new int [personas][2];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int a = 0; a < matriz[0].length; a++) {
				
				if(a == 0) {
					System.out.print("Introduce el genero 0 si es hombre y 1 si es mujer: ");
					matriz[i][a] = entrada.nextInt();
				}
				if(a == 1) {
					System.out.print("Introduce el sueldo: ");
					matriz[i][a] = entrada.nextInt();
				}
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int a = 0; a < matriz[0].length; a++) {
				System.out.print(matriz[i][a] + " ");
			}
			System.out.println("");
		}
		
		for(int i = 0; i < matriz.length; i++) {
			if(matriz[i][0] == 0.0) {
				hombres++;
				totalhombres += matriz[i][1];
			}
			if(matriz[i][0] == 1.0) {
				mujeres++;
				totalmujeres += matriz[i][1];
			}
		}
		System.out.println("El sueldo medio de los hombres es de: " + (totalhombres / hombres));
		System.out.println("El sueldo medio de las mujeres es de: " + (totalmujeres / mujeres));
		
		System.out.println("");
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
