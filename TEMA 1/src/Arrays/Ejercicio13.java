package Arrays;
import java .util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*	Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
			luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
			valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
			1, 3, 5, 7, 9... Con V=7 e I=10, la secuencia sería 7, 17, 27, 37... El programa solicitará al
			usuario V, I además de N (nº de valores a crear).*/
		
		Scanner entrada = new Scanner(System.in);
		
		int V, I, N;
		
		System.out.println("Este programa te permite almacenar una secuencia aritmetica");
		System.out.println("-----------------------------------------------------------");
		
		System.out.print("Introduce el valor inicial: ");
		
		V = entrada.nextInt();
		
		System.out.print("Introduce el valor del incremento: ");
		
		I = entrada.nextInt();
		
		System.out.print("Introduce el numero de valores a crear: ");
		
		N = entrada.nextInt();
		
		int vector[] = new int [N];
		
		for(int i = 0; i < vector.length; i++) {
			
			vector[i] = V;
			
			V = V + I;
			
			System.out.println("Vector[" + i + "]= " + vector[i]);
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
