package Funciones;
import java.util.*;

public class Exercici5 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que pida un valor entero en millas y muestre su equivalente en
	kilómetros.*/
	
	public static double millas_a_kilometros(int millas) {
		
		double kms = 0;
		
		double km = 1.60934;
		
		kms = (double) (millas * km);
		
		return kms;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double kms = 0;
		
		System.out.print("Introduce el numero de millas (numero entero): ");
		
		int millas = entrada.nextInt();
		
		kms = millas_a_kilometros(millas);
		
		System.out.println(millas + " millas son " + kms + " kilometros");
		
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
		
	}

}
