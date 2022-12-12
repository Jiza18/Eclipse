package Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada= new Scanner(System.in);
		
		double array[] = new double [10];
		
		for(int i = 0; i < array.length; i++) {
			
			
			System.out.println("Introduce valor " + i + ":");
			
			array[i] = entrada.nextDouble();
			
		}
		
		for(int a = 0; a < array.length; a++) {
			
			System.out.println("Valores: " + "[" + a + "]= " + array[a]);
		}
		
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
		
	}

}
