package Exam;
import java.util.Scanner;

public class E18 {
	public static void main(String[] args) {
	
		int suma=0;
		int cuadrado=0;
		
		for(int i=1;i<=5;i++) {
			
			cuadrado=i*i;
			suma=suma+cuadrado;
			
		}
		System.out.println("La suma de los cuadrados de los numeros comprendidos entre 1 y 5 es: "+suma);
		
	}

}
