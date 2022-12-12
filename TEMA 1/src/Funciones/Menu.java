package Funciones;
import java.util.*;

public class Menu {
	
	//Jose Miguel Izarra
	
	
	
	public static void menu() {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = 0;
		int v[] = new int [100];
		
		System.out.print("Introduce un numero: ");
		
		int a = entrada.nextInt();
		
		do {
			
			System.out.println("----------------");
			System.out.println("Menu de opciones");
			System.out.println("----------------");
			System.out.println();
			
			System.out.println("1.Llear el vector");
			System.out.println("2.Mostrar el vector");
			System.out.println("3.Calcular la mediana");
			System.out.println("4.Contar numeros mayores");
			System.out.println("5.Salir");
			
			x = entrada.nextInt();
			
			switch(x) {
			
			case 1:
				omplir(v);
				break;
			
			case 2 : 
				mostrarvector(v);
				break;
				
			case 3:
				double valor = 0;
				valor = mitjana(v);
				System.out.println("El valor de la mediana es " + valor);
				break;
				
			case 4:
				int mayores = majors(v,a);
				System.out.println("Hay " + mayores + " mayores que " + a);
				break;
				
			case 5:
				System.out.println("Hasta pronto! :D");
				System.out.println();
				System.out.println("Programa desarrollado por Jose Miguel Izarra©");
				break;
				
			default:
				System.err.println("Selecciona una opcion valida");
				
			}
			
			
		}
		while(x != 5);
		

	}
	
	public static void omplir(int v[]) {
		
		for(int i = 0; i < v.length; i++) {
			v[i] = (int) (-50 + Math.random() * (100 - (-50)));	
		}
		
	}
	public static int mitjana(int v[]) {
		
		int suma = 0;
		
		int media = 0;
		
		for(int i = 0; i < v.length; i++) {
			
			suma += v[i];
			
		}
		
		media = suma / 100;
		
		return media;
	}
	public static int majors(int v[],int x) {
		
		int contmay = 0;
		
		for(int i = 0; i < v.length; i++) {
			
			if(v[i] > x) {
				contmay++;
			}
			
		}
		return contmay;
		
	}
	public static void mostrarvector(int v[]) {
		
		for(int i = 0; i < v.length; i++) {
			System.out.println("Vector [ " + i + "]: " + v[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int v[] = new int [100];
		
		menu();
		
		
	}

}
