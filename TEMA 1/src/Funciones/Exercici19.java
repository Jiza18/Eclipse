package Funciones;
import java.util.*;

public class Exercici19 {
	
	//Jose Miguel Izarra
	
	/*Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
	a la ecuación de Pitágoras: x 2 + y 2 = z 2. El programa solicita al usuario los valores x, y, z. Se
	deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
	Por ejemplo: 3 2 + 4 2 = 5 2.*/
	
	public static void pitagoras(int x, int y, int z) {
		
		int suma = 0;
		int resultado = 0;
		
		suma = (int) (Math.pow(x, 2) + Math.pow(y, 2));
		
		resultado = (int) (Math.pow(z, 2));
		
		if(suma == resultado) {
			
			System.out.println("Es ecuacion de Pitagoras");
			
		}
		else {
			
			System.out.println("No es ecuacion de Pitagoras");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("___________________________________________________________________________________________");
		System.out.println("El programa evaluara si los valores ingresados se ajustan a la ecuacion de Pitagoras");
		System.out.println("Se sumara el valor de x + y, y luego se comprobara si el resultado es igual a el valor de z");
		System.out.println("-------------------------------------------------------------------------------------------");
		
		System.out.print("Introduce el valor de x: ");
		
		int x = entrada.nextInt();
		
		System.out.print("Introduce el valor de y: ");
		
		int y = entrada.nextInt();
		
		System.out.print("Introduce el valor de z: ");
		
		int z = entrada.nextInt();
		
		pitagoras(x,y,z);
		
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
		
	}

}
