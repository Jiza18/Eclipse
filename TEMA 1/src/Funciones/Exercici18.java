package Funciones;
import java.util.*;

public class Exercici18 {

	//Jose Miguel Izarra
	
	/*El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI
	entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
	0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
	13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
	Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
	deberá crear una función a la que se le pase el número y devuelva la letra.
	Ejemplo: para el DNI 56321122 el NIF es ‘X’.*/
	
	public static char NIF(int a) {
		
		char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = a%23;
        return caracteres[resto];
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char NIF;
		
		System.out.print("Introduce el DNI: ");
		
		int dni = entrada.nextInt();
		
		NIF = NIF(dni);
		
		System.out.println("La letra del DNI es " + NIF);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}
	
}
