package Funciones;
import java.util.*;

public class Exercici6 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
	uno tras aplicarle un 21% de IVA.*/
	
	public static double precioConIVA(double precio) {
		
		double IVA = (precio * 21 / 100) + precio;
		
		return IVA;
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double pfinal = 0;
		
		for(int i = 0; i < 5; i++) {
		System.out.print("Introduce el precio del articulo: ");
		
		double precio = entrada.nextDouble();
		
		pfinal = precioConIVA(precio);
		
		System.out.println("El precio del articulo " + (i + 1) + " con 21% de IVA es: " + pfinal);
		
		}
		
		System.out.println("Programa desarrolado por Jose Miguel Izarra©");
	}

}
