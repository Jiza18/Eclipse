package Funciones;
import java.util.*;

public class Exercici14 {
	
	//Jose Miguel Izarra
	
	/*Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
	dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.*/
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el caracter de la piramide: ");
		
		char c = entrada.nextLine().charAt(0);
		
		System.out.print("Introduce la altura de la piramide: ");
		
		int a = entrada.nextInt();
		
		piramide(c,a);
		
		
	}
	
public static void piramide(char c, int a) {
		
		int caracter = 1;
		
		for (int espacios=a; caracter<=(a*2)-1;espacios--, caracter+=2){
	          
            for (int i=0; i<espacios;i++){
                System.out.print(" ");
            }
            
            for (int j=caracter; j!=0;j--){
                System.out.print(c);
            }
            System.out.println("");
        }
		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
	}

}
