package Multidimensionales;
import java.util.*;

public class ExerciciEntrega {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada = new Scanner(System.in);
		
		boolean open = true;
		
		int select = 0;
		
		int suma = 0;
		
		int matriz[][] = new int [4][4];
		
		System.out.println("1.Rellenar toda la matriz");
		System.out.println("2.Suma de una fila");
		System.out.println("3.Suma de una columna");
		System.out.println("4.Suma la diagonal principal");
		System.out.println("5.Suma la diagonal inversa");
		System.out.println("6.Calcular la mediana de todos los valores de la matriz");
		System.out.println("7.Salir");
		
		int opcion = entrada.nextInt();
		
		if(opcion == 7) {
			System.out.println("Hasta luego :D");
			open = false;
		}
		
		else if(opcion != 1) {
			
			System.err.println("Debes rellenar la matriz primero. Reinicia el programa");
			
			open = false;
			
		}
		
		else {
			
			for(int i = 0; i < matriz.length; i++) {
				
				for(int a = 0; a < matriz[0].length; a++) {
					
					System.out.print("Introduce el valor de fila "+i+" columna "+a+":");
					matriz[i][a] = entrada.nextInt();
					
				}
			
			}	
		}
		
		entrada.nextLine();
		
		
		
		while(open) {
		
		
		System.out.println("1.Rellenar toda la matriz");
		System.out.println("2.Suma de una fila");
		System.out.println("3.Suma de una columna");
		System.out.println("4.Suma la diagonal principal");
		System.out.println("5.Suma la diagonal inversa");
		System.out.println("6.Calcular la mediana de todos los valores de la matriz");
		System.out.println("7.Salir");
		
		opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Los valores introducidos sobreescribiran a los existentes en la matriz.");
				
				for(int i = 0; i < matriz.length; i++) {
					
					for(int a = 0; a < matriz[0].length; a++) {
						
						System.out.print("Introduce el valor de fila "+i+" columna "+a+":");
						matriz[i][a] = entrada.nextInt();
						
					}
				}
				entrada.nextLine();
				
				break;
			
			case 2:
				System.out.print("Introduce la fila a sumar:");
				
				select = entrada.nextInt();
				
				for(int a = 0; a < matriz.length; a++) {
					
					suma += matriz[select][a];
				}
				
				System.out.println("El resultado de la suma de la fila es "+suma);
				break;
				
			case 3:
				System.out.print("Introduce la columna a sumar:");
				
				select = entrada.nextInt();
				
				suma = 0;
				
				for(int i = 0; i < matriz.length; i++) {
					
					suma += matriz[i][select];
					
				}
				System.out.println("El resultado de la suma de la columna es "+suma);
				break;
				
			case 4:
				suma =0;
				
				suma = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];
				
				System.out.println("La suma de la diagonal principal es :" + suma);
				break;
				
			case 5:
				suma = 0;
				
				suma = matriz[3][3] + matriz[2][2] + matriz[1][1] + matriz[0][0];
				
				System.out.println("El resultado de la suma de la diagonal inversa es: "+suma);
				break;
				
			case 6:
				int media = 0;
				int contador = 0;
				suma = 0;
				
				for(int i = 0; i < matriz.length; i++) {
					for(int a = 0; a < matriz[0].length; a++) {
						contador++;
						suma += matriz[i][a];
						
					}
					
				}
				
				media = suma/contador;
				
				System.out.println("La mediana de todos los valores de la matriz es: "+media);
				break;
				
			case 7:
				System.out.println("Hasta luego :D");
				open = false;
			}	
			
		}
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
