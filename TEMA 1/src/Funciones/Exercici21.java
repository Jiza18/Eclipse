package Funciones;
import java.util.*;

public class Exercici21 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
	En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
	oportuno.*/
	
	public static int menu() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Seleciona una opcion");
		System.out.println();
		
		System.out.println("1.Circunferencia");
		System.out.println("2.Area");
		
		int option = entrada.nextInt();
		
		return option;
		
	}
	
	public static double pideRadio() {
		
		double radio = 0;
		
		return radio;
	}

}
