package Repas;
import java.util.*;

public class Contrasenya {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		//Al menys 8 caracters, 2 minuscules, 2 majuscules, 2 numeros
		
		Scanner entrada = new Scanner(System.in);
		
		char A = 65;
		
		char Z = 90;
		
		char a = 97;
		
		char z = 122;
		
		char ini = 33;
		
		char fin = 46;
		
		final int minimo = 8;
		
		final int minusculas = 2;
		
		final int mayusculas = 2;
		
		final int numeros = 2;
		
		final int character = 2;
		
		int contmayus = 0;
		
		int contminus = 0;
		
		int contnum = 0;
		
		int contchar = 0;
		
		System.out.print("Introduce la contraseña: ");
		
		String contraseña = entrada.nextLine();
		
		if(contraseña.length() < minimo) {
			System.out.println("La contraseña debe tener al menos 8 caracteres");
		}
		
		char array[] = contraseña.toCharArray();
		
		for (int i = 0; i < contraseña.length(); i++) {
			
			if(array[i] >= A){
				
				if(array[i] <= Z){
					
					contmayus++;
					
				}
				
			}
			
			if(array[i] >= a ) {
				
				if(array[i] <=z) {
					contminus++;
				}
			}
			
			if(array[i] >= '0') {
				
				if(array[i] <= '9') {
					
					contnum++;
					
				}
			}
			if(array[i] >= ini) {
				
				if(array[i] <= fin) {
					
					contchar++;
				}
			}
			
		}
		
		if(contmayus < mayusculas) {
			System.out.println("La contraseña debe tener al menos 2 mayúsculas");
		}
		
		if(contminus < minusculas) {
			System.out.println("La contraseña debe tener al menos 2 minúsculas");
		}
		
		if(contnum < numeros) {
			System.out.println("La contraseña debe tener al menos 2 números");
		}
		
		if(contchar < character) {
			System.out.println("La contraseña debe tener al menos 2 caracteres especiales");
		}
		
		else {
			System.out.println("Contraseña correcta!");
		}
		System.out.println("Programa desarrollado por Jose Miguel Izarra©");
	}

}
