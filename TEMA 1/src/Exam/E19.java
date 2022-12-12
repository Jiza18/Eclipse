package Exam;
import java.util.Scanner;

public class E19 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int num;
		
		
		
			
			System.out.print("Introduce un numero: ");
			
			num=entrada.nextInt();
			
		for(int i=0;i<num;i++) {
			
			if(num>0) {
				System.out.print("*");
			}
		}
		
		for (int a=0;a>num;a--) {
			
			if(num<0) {
				System.out.print("$");
			}
		}
				
		
	}

}
