package Funciones;
import java.util.*;

public class Exercici13 {
	
	//Jose Miguel Izarra
	
	/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
	Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
	crear una función a la que le pasemos ambos valores y nos devuelva el descuento.*/
	
	public static int descuento(double sin,double con) {
		
		int porcentaje = 0;
		
		double a = 100 - ((con * 100) / sin);
		
		porcentaje = (int) a;
		
		return porcentaje;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int descuento = 0;
		
		System.out.print("Introduce el precio original: ");
		
		double sin = entrada.nextDouble();
		
		System.out.print("Introduce el precio despues del descuento: ");
		
		double con = entrada.nextDouble();
		
		descuento = descuento(sin,con);
		
		System.out.println("El porcentaje de descuento del articulo es " + descuento + '%');
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra");
		
	}

}
