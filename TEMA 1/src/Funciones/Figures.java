package Funciones;
import java.util.*;

public class Figures {
	
	//Jose Miguel Izarra
	
	/*Crea un Programa amb Funcions que represente figures (amb *) segons unes condicions establertes
	pel usuari.*/
	
	public static int menu() {
		
		Scanner entrada = new Scanner(System.in);
		int option = 0;
		
		System.out.println();
		System.out.println("Selecciona una opcion:");
		
		System.out.println("1.Línia");
		System.out.println("2.Quadrat");
		System.out.println("3.Trinagle");
		System.out.println("0.Eixir");
		
		option = entrada.nextInt();
		return option;
		
	}
	
	public static void linea() {
		
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		
		System.out.print("Introduce la longitud: ");
		
		int longitud = entrada.nextInt();
		
		for(int i = 0; i < longitud; i++) {
			
			System.out.print('*');
			cont++;
			
		}
		System.out.println(cont + " asteriscos usados");
		
	}
	
	public static void quadrat() {
		
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		
		System.out.print("Introduce la altura: ");
		
		int altura = entrada.nextInt();
		
		System.out.print("Introduce el ancho: ");
		
		int ancho = entrada.nextInt();
		
		for(int i = 0; i < altura; i++) {
			
			for(int a = 0; a < ancho; a++) {
				
				System.out.print('*');
				cont++;
				
			}
			System.out.println();
			
		}
		System.out.println(cont + " asteriscos usados");
		
	}
	
	public static void tringle() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la altura del triangulo: ");
		int cont = 0;
		
		int altura = entrada.nextInt();
		
		int caracter=1;
		
		for (int espacios=altura; caracter<=(altura*2)-1;espacios--, caracter+=2){
          
            for (int i=0; i<espacios;i++){
                System.out.print(" ");
            }
            
            for (int j=caracter; j!=0;j--){
                System.out.print("*");
                cont++;
            }
            System.out.println("");
        }
		System.out.println(cont + " asteriscos usados");
		
	}
	
	public static void main(String[] args) {
		
			int option = menu();
			
			while(option != 0) {
				switch(option) {
				
				case 1:
					linea();
					break;
					
				case 2:
					quadrat();
					break;
					
				case 3:
					tringle();
					break;
					
				default:
					System.err.println("Introduce una opcion valida");
				
				}
			option = menu();
		}
			
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");	
		
	}

}
