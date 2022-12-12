package Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada = new Scanner(System.in);
		
		int vector[] = new int [20];
		
		int sumapos = 0;
		
		int sumaneg = 0;
		
		for(int i = 0; i < vector.length; i++) {
			
			System.out.println("Introduce valor " + i + ":");
			
			vector[i] = entrada.nextInt();
				
				if(vector[i] > 0) {
					
					sumapos += vector[i]; 
				}
				
				if(vector[i] < 0) {
					
					sumaneg += vector[i];
				}
			}
		
		System.out.println("La suma de los positivos es: " + sumapos);
		
		System.out.println("La suma de los negativos es: " + sumaneg);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
