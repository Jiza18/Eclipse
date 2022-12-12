package Arrays;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*	Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
			distintas opciones:
			1. Mostrar valores.
			2. Introducir valor.
			3. Salir.
			La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
			posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
			hasta que el usuario elija la opción ‘c’ que terminará el programa.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int vector[] = new int [10];
		
		int opcion;
		
		int v=0;
		
		int p=0;
		
		boolean salida = false;
		
		while(!salida) {
		System.out.println("Elije una de las siguientes opiones:");
		System.out.println("1.Mostrar valores."
						  +"\n2.Introducir valor."
						  +"\n3.Salir.");
		
		opcion = entrada.nextInt();

		switch(opcion) {
		
		case 1:
			
			for(int i = 0; i < vector.length; i++) {
				
				System.out.println("Vector[" + i + "]= " + vector[i]);
				
			}
			break;
			
		case 2:
			
			System.out.print("Introduce el valor que desea almacenar: ");
			
			v = entrada.nextInt();
			
			System.out.print("Introduce la posicion del vector donde lo desea guardar: ");
			
			p = entrada.nextInt();
			
			vector[p] = v;
			
			break;
			
		case 3:
			
			System.err.println("Has seleccionado la opcion salir");
			System.out.println("Hasta pronto!");
			System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
			
			salida = true;
			break;
			
			}
		}
		
	}

}
