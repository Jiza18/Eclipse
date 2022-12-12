package Condicionals;
import java.util.Scanner;

public class E8 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int p=0;
		int n=0;
		int num=1;
		

		while(num!=0) {
			
			System.out.print("Introduce un numero y presiona ENTER, para finalizar el programa introduzca el numero 0: ");
			
			num=entrada.nextInt();
			
			if(num<0) {
				System.out.println("El numero es negativo");
				n++;
			}
			else if (num>0) {
				p++;
			}
		}
		
		System.out.println("La cantidad de numeros positivos es: "+p);
		System.out.println("La cantidad de numeros negativos es: "+n);
	}

}
