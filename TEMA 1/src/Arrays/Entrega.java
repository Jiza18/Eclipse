package Arrays;
import java.util.Scanner;

public class Entrega {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		/*	Entrega 4 vectors
			Crea un programa amb 2 vectors de tamany 20 i dos vectors de tamany 40
			El primer vector l'omplirem amb enters aleatòris entre 0 i 20.
			El segón vector serà la còpia inversa del primer.
			El tercer vector estarà format per els dos primers, la primera meitat per el vector d'aleatòris i la segona meitat per el voctor de còpia inversa
			L'últim vector, l'omplirem alternativament amb els elements dels dos primers.*/
		
		int vector1[] = new int [20];
		int vector2[] = new int [20];
		int vector3[] = new int [40];
		int vector4[] = new int [40];
		
		int descont = 19;
		
		System.out.println("---------------------------------");
		System.out.println("-------------VECTOR 1------------");
		System.out.println("---------------------------------");
		

		for(int i = 0; i < vector1.length; i++) {
		
			vector1[i] = (int) (Math.random()*20);;
			
			System.out.println("Vector[" + i + "]= " + vector1[i]);
			
		}
		System.out.println("---------------------------------");
		System.out.println("-------------VECTOR 2------------");
		System.out.println("---------------------------------");
		
		for(int a = 0; a < vector2.length; a++) {
			
			vector2[a] = vector1[descont];
			
			descont--;
			
			System.out.println("Vector[" + a + "]= " + vector2[a]);
		}
		System.out.println("---------------------------------");
		System.out.println("-------------VECTOR 3------------");
		System.out.println("---------------------------------");
		
		for(int e = 0; e < 9; e++) {
			
			vector3[e] = vector1[e];
			
			System.out.println("Vector[" + e + "]= " + vector3[e]);
		}
		
		int c = 0;
		
		for(int o = 10; o < vector2.length; o++) {
		
		
			vector3[o] = vector2[c];
			c++;
	
			
			System.out.println("Vector[" + o + "]= " + vector3[o]);
		}
		
		System.out.println("---------------------------------");
		System.out.println("-------------VECTOR 4------------");
		System.out.println("---------------------------------");

		int x = 1;
		int cont = 0;
		int cont2 = 1;
		
		int bandera = 0;
		
		for(int u = 0; u < vector4.length; u++) {
			
			if(u == x) {
				bandera = 1;
			}
			
			else if (u != x) {
				bandera = 0;
			}
			
			if(bandera == 0) {
				vector4[cont] = vector1[cont];
			}
			else {
				vector4[cont2] = vector2[cont];
			}
					
			System.out.println("Vector[" + u + "]= " + vector4[u]);
		}
	}

}
