package Funciones;
import java.util.*;

public class Exercici4 {
	
	//Jose Miguel Izarra
	
	/*Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
	positivo, negativo o cero*/
	
	public static int dimeSigno(int a) {
		
		int tipo = 0;
		
		if(a < 0) {
			tipo = -1;
		}
		else if(a > 0) {
			tipo = 1;
		}
		else if(a == 0) {
			tipo = 0;
		}
		return tipo;
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		
		int num = entrada.nextInt();
		
		System.out.println(dimeSigno(num));
		
		System.out.println("Progrma desarrollado por Jose Miguel Izarra©");
	}

}
