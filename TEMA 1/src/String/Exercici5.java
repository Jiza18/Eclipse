package String;
import java.util.*;

public class Exercici5 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Realitza un programa que llija una frase per teclat i indique si la frase és un palíndrom o no (ignorant
		espais i sense diferenciar entre majúscules i minúscules).
		Suposarem que l'usuari només introduirà lletres i espais (ni comes, ni punts, ni accents, etc.).
		Un palíndrom és un text que es llig igual d'esquerra a dreta que de dreta a esquerra.
		Per exemple:
		Yo hago yoga hoy
		Ella te da detalle
		Lavan esa base naval
		Amo la pacifica paloma*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdueix una frase:");
		
		String frase = entrada.nextLine().replace(" ", "").toLowerCase();
		
		String invertida = "";
		
		for(int i = frase.length() - 1; i >= 0 ; i--) {
			
			invertida += frase.charAt(i);
			
		}
		
		if(frase.equals(invertida)) {
			
			System.out.println("Es palíndrom");
			
		}
		else {
			
			System.out.println("No es palíndrom");
		}
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
		
		
	}

}
