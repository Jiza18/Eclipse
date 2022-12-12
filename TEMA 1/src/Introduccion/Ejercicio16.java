package Introduccion;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce la calificación: ");
		
		double calificacion=entrada.nextDouble();
		
		if(calificacion>10) {
			System.err.println("Calificación incorrecta");
		}
		else if(calificacion>8) {
			
			System.out.println("Sobresaliente");
		}
		
		
		else if(calificacion>=6) {
			
			System.out.println("Notable");
		}
		
		else if(calificacion>=5) {
			
			System.out.println("Bien");
		}
		
		else if(calificacion>=3) {
			
			System.out.println("Insufuciente");
		}
		
		else if(calificacion>=0) {
			
			System.out.println("Muy deficiente");
		}
		
		else {}
		
		
	
	}//Del main

}//De la clase
