package Bucles;
import java.util.Scanner;

public class Bucles5 {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		int fact, num;
		
		
		System.out.print("Introduce el numero N: ");
		
		num=entrada.nextInt();
		fact=1;
		
		for(int i=num;i>0;i--) {
			
			fact=fact*i;
			
			
			
		}
		System.out.print("El factorial es: "+fact);
	}

}
