package Bucles;
import java.util.Scanner;

public class Bucles4 {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		int i;
		System.out.print("Introduzca el numero N: ");
		
		int numero=entrada.nextInt();
	
		for(i=1;i<=numero;i++) {
			
			System.out.println(i);
		}
	}

}
