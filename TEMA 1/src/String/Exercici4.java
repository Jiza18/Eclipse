package String;
import java.util.*;
import java.lang.*;

public class Exercici4 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Crea un programa que mostre per pantalla quantes vocals de cada tipus hi ha (quantes ‘a’, quantes ‘e’,
		etc.) en una frase introduïda per teclat.
		No s'ha de diferenciar entre majúscules i minúscules. Per exemple donada la frase “Sempre plou
		quan no hi ha escola” dirà que hi ha:
		El número de ‘a’ es: 3
		El número de ‘e’ es: 3
		El número de ‘i’ es: 1
		El número de ‘o’ es: 3
		El número de ‘u’ es:: 2*/
		
		Scanner entrada = new Scanner(System.in);
		
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		
		String frase;
		
		System.out.println("Introdueix una frase:");
		
		frase = entrada.nextLine();
		
		for(int x = 0; x < frase.length(); x++) {
			
			if(frase.charAt(x) == 'a') {
				
				a++;
				
			}
			
			if(frase.charAt(x) == 'e') {
				
				e++;
				
			}
			
			if(frase.charAt(x) == 'i') {
				
				i++;
				
			}
			
			if(frase.charAt(x) == 'o') {
				
				o++;
				
			}
			
			if(frase.charAt(x) == 'u') {
				
				u++;
			}
			
		}
		

		
		System.out.println("La quantitat de vocals a en la frase es: " +a);
		System.out.println("La quantitat de vocals e en la frase es: " +e);
		System.out.println("La quantitat de vocals i en la frase es: " +i);
		System.out.println("La quantitat de vocals o en la frase es: " +o);
		System.out.println("La quantitat de vocals u en la frase es: " +u);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
			
		
	}

}
