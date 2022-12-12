package Arrays;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*	Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
			Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
			mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
			por debajo de la media.*/
		
		Scanner entrada = new Scanner(System.in);
		
		double max=-1000;
		
		double media=0;
		
		double min=1000;
		
		int contmin=0;
		
		int contmax=0;
		
		double suma=0;
		
		
		System.out.print("Introduce el numero de alturas a evaluar: ");
		
		int n = entrada.nextInt();
		
		double vector[] = new double [n];
		
		for(int i = 0;i < vector.length; i++) {
			
			System.out.print("Introduce la altura de la persona " + (i+1) + ": ");
			
			vector[i] = entrada.nextDouble();
			
			suma += vector[i];
			
		}
		
		media = suma / n;
		
		for(int a = 0; a < vector.length; a++) {
			 
			
			if(vector[a] > max) {
				max = vector[a];
			}
			
			if(vector[a] < min) {
				min = vector[a];
			}
			
			if(vector[a] < media) {
			
				contmin++;
			
		}
			
			if(vector[a] > media) {
				
				contmax++;
			}
		
		}
		
		System.out.println("La altura maxima es: " + max);
		System.out.println("La altura minima es: " + min);
		System.out.println("Y la altura media es: " + media);
		System.out.println("El numero de alturas por encima de la media es: " + contmax);
		System.out.println("El numero de alturas por debajo de la media es: " + contmin);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
