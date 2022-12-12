package Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*	Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
			utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
			cuántos valores del array son igual o superiores a R.*/
		
		Scanner entrada = new Scanner(System.in);
		
		double array[]= new double [100];
		
		double R;
		
		int iguales=0;
		
		int mayores=0;
		
		
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = Math.random() * 1;
			
		}
		
		System.out.println("Introduce el valor de R: ");
		
		R = entrada.nextDouble();
		
		for(int a = 0; a < array.length; a++) {
			
			if(R == array[a]) {
				iguales++;
			}
			if(array[a] > R) {
				mayores++;
			}
			
		}
		
		System.out.println("La cantidad de numeros iguales a " + R + " es: " + iguales);
		System.out.println("La cantidad de numeros superiores que " + R + " es: " + mayores);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
