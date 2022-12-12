package Arrays;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada = new Scanner(System.in);
		
		double vector[] = new double [10];
		
		int suma = 0;
		
		for(int i = 0; i < vector.length; i++) {
			
			
			System.out.println("Introduce valor " + i + ":");
			
			vector[i] = entrada.nextDouble();
			
		}
		
		for(int a = 0; a < vector.length; a++) {
			
			suma += vector[a];
			
		}
		
		System.out.println("El resultado de la suma es= " + suma + "\n");
		
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
	}

}
