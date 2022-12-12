package Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		double suma = 0;
		
		double mediana;
		
		Scanner entrada = new Scanner(System.in);
		
		double vector[] = new double [20];
		
		for(int i = 0; i < vector.length; i++) {
			
			System.out.println("Introduce valor " + i + ":");
			
			vector[i] = entrada.nextInt();
		}
		
		for(int a = 0; a < vector.length; a++) {
			
			suma += vector[a];
			
		}
		
		mediana = suma / vector.length;
		
		System.out.println("La mediana es: " + mediana);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
