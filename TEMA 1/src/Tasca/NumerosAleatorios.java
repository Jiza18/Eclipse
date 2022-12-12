package Tasca;
import java.util.Scanner;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		String enter;
		
		System.out.println("Pulsa ENTER para tirar los dados: ");
		
		enter=entrada.nextLine();
		int dados;
		int suma=0;
		for (int i = 1; i <= 3; i++) {
			dados=(int) (Math.random()*6+1);
			System.out.print(dados + " ");
			suma+=dados;
			}
		System.out.println("\n\nEl total de tus dados es: "+suma);
		
	}

}
