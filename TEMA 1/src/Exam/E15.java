package Exam;
import java.util.Scanner;

public class E15 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		
		int num;
		int impar=0;
		
		
		System.out.print("Introduce un numero: ");
		
		num=entrada.nextInt();
		
		for(int i=3;i<num;i=i+3) {
			
			if(num%2!=0) {
				impar++;
			}
		}
	
		
		System.out.println("La cantidad de multiplos de 3 en el numero "+num+" es: "+impar);
	}

}
