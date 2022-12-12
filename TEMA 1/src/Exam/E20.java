package Exam;
import java.util.Scanner;

public class E20 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int num;
		int num2;
		int num3=0;
		
		System.out.print("Introduce un numero: ");
		num=entrada.nextInt();
		num2=num;
		
		for(int i=0;i<num;i++) {
			
			if(num2>i) {
				++num3;
				System.out.print(num3);
				num2--;
			}
			else {
				
			}
			
		}
	}

}
