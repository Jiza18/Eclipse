package String;
import java.util.*;

public class Exercici2 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Crea un programa que demane dos cadenes de text per teclat i després mostre per pantalla si són
		iguals, a continuació mostre si són iguals sense diferenciar entre majúscules i minúscules.*/
		
		Scanner entrada = new Scanner(System.in);
		
		String frase1;
		String frase2;
		
		System.out.println("Introdueix la primera frase:");
		
		frase1 = entrada.nextLine();
		
		System.out.println("\nIntrodueix la segona frase:");
		
		frase2 = entrada.nextLine();
		
		if (frase2.equalsIgnoreCase(frase1)) {
			
			System.out.println("\nLas frases son iguales.");
			
		}
		
		else {
			
			System.out.println("\nLas frases no son iguales.");
			
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
