package Arrays;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*	Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
			valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
			muestre por pantalla.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int vector[] = new int [55];
		
		int num = 1;
		
		for(int i = 0; i < vector.length; i++) {
			
			if(i != num) {
				
				vector[i] = num;
				
			}
			
			System.out.println(vector[i]);
			num++;
		}
		
	}

}
