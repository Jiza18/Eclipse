package Funciones;
import java.util.*;

public class Exercici2 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
	o no.*/
	
	public static boolean esMayorDeEdad(int a) {
		boolean si = false;
		
		if(a>=18) {
			si = true;
		}
		return si;
		
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la edad: ");
		
		int numedad = entrada.nextInt();
		
		if(esMayorDeEdad(numedad)) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
		}
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
	}

}
