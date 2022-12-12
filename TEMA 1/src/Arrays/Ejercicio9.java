package Arrays;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*	Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
			enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
			mostrará en qué posiciones del array aparece N.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int vector[] = new int [100];
		
		for(int i = 0; i < vector.length; i++) {
			
			vector[i] = (int) (Math.random() * 10 + 1);
		}
		
		System.out.println("Introduce el valor de N: ");
		
		int n = entrada.nextInt();
		
		for(int a = 0; a < vector.length; a++) {
			
			if(n == vector[a]) {
				System.out.println("El valor " + n + " se encuentra en las siguientes posiciones del vector: " + "[" + a + "]");
			}
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
