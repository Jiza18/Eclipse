package Condicionals;
import java.util.Scanner;

public class E9 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int num=0;
		int suma=0;
		int producto=1;
		
		for(int i=0;i<10;i++) {
			
			System.out.print("Introduce un numero: ");
			
			
			num=entrada.nextInt();
			
			suma=suma+num;
			producto=producto*num;
			
		}
		
		
		System.out.println("El resultado de la suma es: "+suma);
		System.out.println("El producto de los numeros es: "+producto);
	}

}
