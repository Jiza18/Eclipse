package Funciones;
import java.util.*;

public class Exercici9 {
	
	//Jose Miguel Izarra
	
	/*Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
	elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
	tres) y nos devuelva el máximo de los dos valores.*/
	
	public static int mayor(int n, int x) {
		
		int mayor = 0;
		
		if(n > x) {
			mayor = n;
		}
		else {
			mayor = x;
		}
		return mayor;
		
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int m = 0;
		
		int e = 0;
		
		System.out.print("Introduce el primer numero: ");
		
		int n = entrada.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		
		int x = entrada.nextInt();
		
		System.out.print("Introduce el tercer numero: ");
		
		int a = entrada.nextInt();
		
		m = mayor(n,x);
		e = mayor(m,a);
		
		if(m < e) {
			System.out.println("El numero mas elevado es: " + m);
		}
		else {
			System.out.println("El numero mas elevado es: " + e);
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
