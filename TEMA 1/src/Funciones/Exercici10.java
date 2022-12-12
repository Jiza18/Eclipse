package Funciones;
import java.util.*;

public class Exercici10 {
	
	//Jose Miguel Izarra
	
	/*Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
	si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
	función donde le pasemos los datos y devuelva si es correcta o no.*/
	
	public static boolean mes(int a, int b, int c) {
		
		boolean fecha = true;
		
		if(a > 30 && a< 1) {
			fecha = false;
		}
		if(b > 12 && b < 1) {
			fecha = false;
		}
		if(String.valueOf(c).length() > 4 && c > 2022) {
			fecha = false;
		}
		return fecha;
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean fecha = true;
		
		System.out.print("Introduce el dia: ");
		
		int a = entrada.nextInt();
		
		System.out.print("Introduce el mes: ");
		
		int b = entrada.nextInt();
		
		System.out.print("Introduce el año: ");
		
		int c = entrada.nextInt();
		
		fecha = mes(a,b,c);
		
		if(fecha) {
			System.out.println("La fecha es correcta");
		}
		else {
			System.err.println("La fecha es incorrecta");
		}
		
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
		
	}

}
