package Exam;
import java.util.Scanner;

public class E17 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		double acu=0;
		double num;
		int numin=0;
		int numfail=0;
		do {
			
			System.out.print("Introduce un numero: ");
			
			num=entrada.nextDouble();
			numin++;
			
			
			if(num<acu) {
				System.err.println("Fallo es menor");
				numfail++;
			}
			
			acu=num;
			
		}
		while(num!=0);
		
		System.out.println("La cantidad de numeros introducidos es: "+numin);
		System.out.println("La cantidad de fallos es: "+numfail);
	}

}
