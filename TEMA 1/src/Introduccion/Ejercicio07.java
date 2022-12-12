package Introduccion;
import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca la distancia en millas marinas:");
		
		double millas=entrada.nextDouble();
		double metros=millas*1852;
		
		System.out.println("La distancia en metros es:" +metros);
	}

}
