package Funciones;
import java.util.*;

public class Exeercici12 {
	
	//Jose Miguel Izarra
	
	/*Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
	tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
	millas.*/
	
	public static double km_to_miles(double km) {
		
		double miles = 0;
		
		double mile = 1.60934;
		
		miles = km / mile;
		
		return miles;
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double miles = 0;
		
		System.out.print("Introduce los kilometros a transformar: ");
		
		double kilometros = entrada.nextDouble();
		
		miles = km_to_miles(kilometros);
		
		
		
		System.out.println("La cantidad de millas en " + kilometros + " kilometros es " + String.valueOf(miles).substring(0,6));
		
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
	
}

}
