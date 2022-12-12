package Introduccion;

public class OperacionesLogicas {
	public static void main(String args[]) {
		
		//Exercici 4.- Indica l’eixida per pantalla d’este programa.
		
		boolean x = true;
		int A=5,B=3,C=-12;
		System.out.println(x || (6 > 10));
		System.out.println(((4 <= 4) || false) && (!x));
		System.out.println( A + B + C == 5);
		System.out.println((A + B == 8) && (A-B == 2));
		System.out.println(A > 3 && B >= 3 && C < -3);
		
	}

}
