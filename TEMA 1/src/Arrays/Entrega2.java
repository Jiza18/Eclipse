package Arrays;
import java.util.*;

public class Entrega2 {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		//a) Crea un vector de grandària 10 i ompli'l amb valors aleatoris entre 0 i 30. Mostra'l per pantalla
		
		System.out.println("----------");
		System.out.println("EXERCICI 1");
		System.out.println("----------");
		
		int vector[] = new int [10];
		
		for(int i = 0; i < vector.length; i++) {
			
			vector[i] = (int) (Math.random() * 30);
			
			System.out.println("Vector[" + i + "]= " + vector[i]);
			
		}
		
		//b) Calcula la suma i la mitjana de tots els valors del vector. Mostra'ls per pantalla.
		
		System.out.println("----------");
		System.out.println("EXERCICI 2");
		System.out.println("----------");
		
		double suma = 0;
		double mitjana = 0;
		
		for(int a = 0; a < vector.length; a++) {
			
			suma = suma + vector[a];
			
		}
		
		mitjana = suma/vector.length;
		
		System.out.println("La suma dels valors del vector es: " + suma);
		System.out.println("La mitjana dels valors del vector es: " + mitjana);
		
		
		//Ordena el vector. Mostra el vector per pantalla
		
		System.out.println("----------");
		System.out.println("EXERCICI 3");
		System.out.println("----------");
		
		Arrays.sort(vector);
		
		for(int b = 0; b < vector.length; b++) {
			
			System.out.println("Vector[" + b + "]= " + vector[b]);
			
		}
		
		
		//d) Mostra per pantalla el número màxim i el mínim.
		
		System.out.println("----------");
		System.out.println("EXERCICI 4");
		System.out.println("----------");
		
		
		int min = 0;
		int max = 9;
		
		System.out.println("El número minim en el vector es: " + "Vector[" + min + "]= " + vector[min]);
		System.out.println("El número màxim del en el vector es: " + "Vector[" + max + "]= " + vector[max]);
		
		
		//e) Crea un vector de grandària 10, ompli tots les posicions amb el valor -10. Mostra el vector per pantalla.
		
		System.out.println("----------");
		System.out.println("EXERCICI 5");
		System.out.println("----------");
		
		
		int vector2[] = new int [10];
		
		for(int d = 0; d < vector2.length; d++) {
			
			vector2[d] = -10;
			
			System.out.println("Vector[" + d + "]= " + vector2[d]);
			
		}
		
		
		//Crea una còpia del vector anterior.
		
		/*System.out.println("----------");
		System.out.println("EXERCICI 6");
		System.out.println("----------");*/
		
		int copyvector2[] = new int [10];
		
		for(int e = 0; e < copyvector2.length; e++) {
			
			copyvector2[e] = vector2[e];
			
		}
		
		
		//Del vector copiat, assigna el valor 3 a les posicions de 5 a 9. Mostra el vector per pantalla
		
		System.out.println("----------");
		System.out.println("EXERCICI 7");
		System.out.println("----------");
		
		Arrays.fill(copyvector2,5,9,3);
		
		for(int f = 0; f < copyvector2.length; f++) {
			
			System.out.println("Vector[" + f + "]= " + copyvector2[f]);
			
		}
		
		
		//Crea un vector que multiplique el primer vector amb l'últim. Mostra el vector per pantalla.
		
		System.out.println("----------");
		System.out.println("EXERCICI 8");
		System.out.println("----------");
		
		int multiplicat[] = new int [10];

		for(int g = 0; g < multiplicat.length; g++) {
			
			multiplicat[g] = vector[g] * copyvector2[g];
			
			System.out.println("Vector[" + g + "]= " + multiplicat[g]);
			
		}
		
		
		//Ordena el vector multiplicat. Mostra el vector per pantalla
		
		System.out.println("----------");
		System.out.println("EXERCICI 9");
		System.out.println("----------");
		
		Arrays.sort(multiplicat);
		
		for(int h = 0; h < multiplicat.length; h++) {
			
			System.out.println("Vector[" + h + "]= " + multiplicat[h]);
			
		}

		
		System.out.println("\nPrograma desarrollado por Jose Miguel Izarra©");
		
			
		
		
		
	}

}
