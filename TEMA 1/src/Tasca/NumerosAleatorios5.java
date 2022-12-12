package Tasca;
import java.util.Scanner;
public class NumerosAleatorios5 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int compta=0;
		int num;
		
		do {
			num= ((int) (Math.random()*100));
			System.out.println(num);
			compta++;
			if(num==24) {
				System.out.println("¡LISTO!");
			}
		}
		while(num!=24);
		
		System.out.println("El total de numeros introducidos antes del 24 es: "+compta);
	}
	

}
