package Exam;
import java.util.Scanner;

public class E16 {
	public static void main(String[] args) {
		
		boolean primo=true;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Introduce un numero positivo: ");
		
		int num=entrada.nextInt();
		
		if(num<0) {
			System.err.println("El numero ingresado no es positivo, por favor reinicia el programa");
		}
		else if(num%2==0) {
			
			primo=false;
			System.out.println("El numero no es primo");
			
		}
		else if(primo==true) {
			
			System.out.println("El numero es primo");
		}
	}

}
