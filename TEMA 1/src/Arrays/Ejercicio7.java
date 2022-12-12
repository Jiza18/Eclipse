package Arrays;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
		todos los valores desde P hasta Q, y lo muestre por pantalla.*/
		
		Scanner entrada= new Scanner(System.in);
		
		int P;
		int Q;
		int a=0;
		
		System.out.print("Introduce el valor P: ");
		
		P = entrada.nextInt();
		
		System.out.print("Introduce el valor Q: ");
		
		Q = entrada.nextInt();
		
		int vector[] = new int [Q];
		
		for (int i=P; i <= Q; i++) {
			
			vector[a] = i;
			
			System.out.println("vector[" + a + "]= " + vector[a]);
			
			a++;
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
