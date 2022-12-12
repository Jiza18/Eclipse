package Condicionals;
import java.util.Scanner;

public class E7 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int n=0;
		int p=0;
		
		for (int i=0;i<10;i++) {
			
			System.out.print("Introduce un numero y presiona ENTER:");
			
			int num=entrada.nextInt();
			
			if(num==0) {
				System.err.println("Haz introducido un numero nulo");
			}
			
			if(num>0) {
				p++;
			}
			else if(num<0) {
				n++;
			}
		}
		
		System.out.print("La cantidad de numeros positivos es: "+p);
		System.out.print("\nLa cantidad de numeros negativos es: "+n);
		
		
	}

}
