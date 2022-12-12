package Introduccion;
import java.util.Scanner;

public class Ejercicio04 {
	
	public static void main(String args[]) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		
		float num1=entrada.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		
		float num2=entrada.nextInt();
		
		float suma=num1+num2, resta=num1-num2, producto=num1*num2, division=num1/num2;
		
		System.out.println("El resultado de la suma es:" +suma);
		System.out.println("El resultado de la resta es:" +resta);
		System.out.println("El resultado de la multiplicación es:" +producto);
		System.out.println("El resultado de la division es:" +division);
		
		
		
	}

}
