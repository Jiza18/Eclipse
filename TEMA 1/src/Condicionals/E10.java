package Condicionals;
import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int nota;
		int cant=0;
		
		do {
			
			System.out.print("Introduce una nota de 0 a 10 y presiona ENTER, para finalizar el programa escribe -1: ");
			
			nota=entrada.nextInt();
			
			if(nota==10) {
				cant++;
			}
			
		}
		while(nota!=-1);
		
		if(cant==0) {
			System.err.println("No hay calificaciones sobresalientes (10)");
		}
		else {
			System.out.println("La cantidad de notas sobresalientes (10) son: "+cant);
		}
		
	}

}
