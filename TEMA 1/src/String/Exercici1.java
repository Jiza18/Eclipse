package String;
import java.util.*;

public class Exercici1 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Crea un programa que demane una cadena de text per teclat i després mostre cada paraula de la
		cadena en una línia diferent.*/
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Introdueix una frase per teclat: ");
		
		frase = entrada.nextLine();
		
		String[] split = frase.split(" ");
		
		for(int i = 0; i < split.length; i++ ) {
			
			System.out.println(split[i]);
			
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
