package Funciones;
import java.util.*;

public class Inici {
	
	public static int sumar(int numero) {
		int z = 0;
		
		for(int i = 0; i <= numero; i++) {
			
			z += numero;
			
		}
		return z;
	}
	
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada = new Scanner(System.in);
		
		int suma = 0; int suma2 = 0; int suma3 = 0; int resultado = 0;
		
		System.out.print("Introduce 3 numeros: ");
		
		int x = entrada.nextInt();
		
		int y = entrada.nextInt();
		
		int z = entrada.nextInt();
			
			suma = sumar(x);
			
			suma2 = sumar(y);
			
			suma3 = sumar(z);
			
		resultado = suma + suma2 + suma3;
		
		System.out.println("El resultado de la suma de todos los numeros es: " + resultado);
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}
	

}
