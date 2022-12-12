package String;
import java.util.*;

public class Exercici3 {

	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*Crea un programa que demane per teclat tres cadenes de text: nom i dos cognoms. Després mostrarà
		un codi d'usuari (en majúscules) format per la concatenació de les tres primeres lletres de cadascun
		d'ells. Per exemple si s'introdueix “Federico”, “Garcia” i “Lorca” mostrarà “FEDGARLOR”.*/
		
		Scanner entrada = new Scanner(System.in);
		
		String nom;
		String cognom1;
		String cognom2;
		
		System.out.println("Introdueix el nom:");
		
		nom = entrada.nextLine();
		
		System.out.println("\nIntroduix el primer cognom:");
		
		cognom1 = entrada.nextLine();
		
		System.out.println("\nIntrodueix el segon cognom:");
		
		cognom2 = entrada.nextLine();
		
		nom = nom.substring(0, 3);
		
		cognom1 = cognom1.substring(0, 3);
		
		cognom2 = cognom2.substring(0, 3);
		
		nom = nom.toUpperCase();
		cognom1 = cognom1.toUpperCase();
		cognom2 = cognom2.toUpperCase();
		
		System.out.println("El teu codi de usuari es: " +nom+cognom1+cognom2);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");

	}

}
