package Condicionals;
import java.util.Scanner;

public class E12 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		double a;
		double b;
		double p;
		
		System.out.println("Introduce el valor de A: ");
		
		a=entrada.nextInt();
		
		System.out.println("Introduce el valor de B: ");
		
		b=entrada.nextInt();
		
		p=Math.pow(a, b);
		
		System.out.println("El valor de A^B es: "+p);
	}

}
