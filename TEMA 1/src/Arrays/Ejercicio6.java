package Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada = new Scanner(System.in);
		
		int N;
		int M;
		
		System.out.println("Introduce el valor N: ");
		
		N = entrada.nextInt();
		
		System.out.println("Introduce el valor M");
		
		M = entrada.nextInt();
		
		int array[] = new int [N];
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = M;
			
			System.out.println("vector[" + i + "]= " + array[i]);
		}
		
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
