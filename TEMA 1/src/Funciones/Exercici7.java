package Funciones;
import java.util.*;

public class Exercici7 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
	su perímetro.*/
	
	public static double perimetroRectangulo(double ancho,double alto) {
		
		double p = 0;
		
		p = (2 * ancho) + (2 * alto);
		
		return p;
		
	}
	
	public static double areaRectangulo(double ancho,double alto) {
		
		double a = 0;
		
		a =  ancho * alto;
		
		return a;
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double area, perimetro;
		
		System.out.print("Introduce el ancho del rectangulo: ");
		
		double ancho = entrada.nextDouble();
		
		System.out.print("Introduce el alto del rectangulo: ");
		
		double alto = entrada.nextDouble();
		
		area = areaRectangulo(ancho,alto);
		
		perimetro = perimetroRectangulo(ancho,alto);
		
		System.out.println("El area del triangulo es " + area + " y el perimetro es " + perimetro);
		
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
		
	}

}
