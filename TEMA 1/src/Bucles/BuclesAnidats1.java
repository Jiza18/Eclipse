package Bucles;
import java.util.*;

public class BuclesAnidats1 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño de la piramide: ");
		
		int altura = entrada.nextInt();
		
		int caracter=1;
		
		for (int espacios=altura; caracter<=(altura*2)-1;espacios--, caracter+=2){
          
            for (int i=0; i<espacios;i++){
                System.out.print(" ");
            }
            
            for (int j=caracter; j!=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
		
		System.out.println("\nPrograma desarrolado por Jose Miguel Izarra©");
		
	}

}
