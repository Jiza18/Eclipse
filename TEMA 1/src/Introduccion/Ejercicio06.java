package Introduccion;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el precio del articulo:");
		
		double precioart=entrada.nextDouble();
		
		System.out.println("Introduzca el precio de venta:");
		
		double precioven=entrada.nextDouble();
		
		double descuento=((precioart-precioven)*100)/precioart;
		
		System.out.println("El descuento es:" +descuento);
		
	}

}
