package Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada = new Scanner(System.in);
		
		double vector[] = new double [10];
		
		double max = -100000;
				
		double min = 100000;		
		
		for(int i = 0; i < vector.length; i++) {
			
			
			System.out.println("Introduce valor " + i + ":");
			
			vector[i] = entrada.nextDouble();
			
			if(vector[i] > max) {
				max=vector[i];
			}
			
			if(vector[i] < min) {
				min = vector[i];
			}
		
		}
		
		System.out.println("El maximo es " + max);
		System.out.println("El minimo es " + min);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");

	}

}
