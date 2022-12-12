package Introduccion;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String args[]) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el valor del radio:");
		
		double r=entrada.nextInt();
		double Pi=3.1416;
		double l=2*r*Pi;
		double area=Pi*r*r;
		double volumen=4/3*Pi*r*r*r;
		
		System.out.println("La longitud de la circunferencia es;" +l);
		System.out.println("El area del circulo es:" +area);
		System.out.println("El volumen de la esfera es:" +volumen);
		
				
		
		
		
		
		
	}

}
