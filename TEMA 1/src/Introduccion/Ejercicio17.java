package Introduccion;
import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Introduce la hora:");
		
		int hora=entrada.nextInt();
		
		System.out.print("\nIntroduce los minutos:");
		
		int minutos=entrada.nextInt();
		
		System.out.print("\nIntroduce los segundos:");
		
		int segundos=entrada.nextInt();
		
		if(segundos>=59) {
			segundos=00;
			++minutos;
		}
		else {
			++segundos;
		}
		
		if(minutos>=59) {
			minutos=00;
			hora++;
		}
		else {}
		
		if(hora>23) {
			hora=00;
		}
		else {}
		
		
		System.out.println("\n"+hora+":"+minutos+":"+segundos);
		
		
	}//del main		

}//de class
