package Arrays;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*	Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
			primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
			primer array al segundo array en orden inverso, y mostrar ambos por pantalla.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int descont = 99;
		
		int vector1[] = new int [100];
		
		int vector2[] = new int [100];
		
		for(int i = 0; i < vector1.length; i++) {
			
			vector1[i] = i + 1;
			
			System.out.println("Vector 1[" + i + "]= " + vector1[i]);
			
		}
		
		System.out.println("------------------------");
		
		for (int a = 0; a < vector2.length; a++) {
			
			vector2[a] = vector1 [descont];
			
			descont--;

			System.out.println("Vector 2[" + a + "]= " + vector2[a]);;
			
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
