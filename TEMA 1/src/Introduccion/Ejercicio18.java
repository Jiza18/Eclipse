package Introduccion;
import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Introduzca su nombre:");
		
		String nombre=entrada.nextLine();
		
		System.out.print("\nIntroduce las horas trabajadas:");
		
		int horas=entrada.nextInt();
		
		System.out.println("\nIntroduce la tarifa normal: ");
		
		int tarifa=entrada.nextInt();
		
		double impuesto=0;
		
		double salario;
		
		if(horas<=35) {
			salario=horas+tarifa;
		}
		else {
			salario=horas+(tarifa*1.5);
		}
		if(salario>900) {
			impuesto=(400*0.25)+(salario-900)*0.45;
			
		}
		else {
			if(salario>500) {
				impuesto=(salario-500)*0.25;
				
			}
		}
		
		double neto=salario-impuesto;
		
		System.out.println("El salario neto de: "+nombre+" asciende a "+neto+"€");
		
	}//del main

}//de class
