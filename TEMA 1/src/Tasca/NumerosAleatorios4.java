package Tasca;
import java.util.Scanner;
public class NumerosAleatorios4 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int num = (int) ((Math.random() * 100)+1);
		
		System.out.println("\n"
				+ "           (.)(.)\n"
				+ "          /  ()  \\\n"
				+ "        _ \\ '--' / _\n"
				+ "       { '-`\"\"\"\"`-' }\n"
				+ "        `\"/      \\\"`\n"
				+ "          \\      /\n"
				+ "         _/  /\\  \\_\n"
				+ "        {   /  \\   }\n"
				+ "         `\"`    `\"`");
		System.out.println("-------------------------");
		System.out.println("Intenta advinar el numero.");
		System.out.println("-------------------------");
		System.out.println("Tienes 5 intentos.");
		System.out.println("-------------------------");
		
		System.out.println("Introduce un numero del 1 al 100: ");
		
		int intro=entrada.nextInt();
		
		for (int i=0; i<=5; i++) {
			
			if(intro==num) {
				System.out.println("¡Has acertado! ＼(＾O＾)／");
				break;
			}
			else if (i == 5) { 
			      System.out.println("Lo siento: ¡has perdido!. El número era el: " + num+" ¯\\_(ツ)_/¯"); 
			      break; }
			
			else if (num > intro) 
			      System.out.println("El número secreto es MAYOR que " + intro);
			    else if (num < intro)
			      System.out.println("El número secreto es MENOR que " + intro);
			
			if(i==1) {
				System.out.println("¡Has fallado! ¡Intentalo de nuevo! (ړײ)");
				System.out.println("Te quedan 4 intentos.\n");
				
				System.out.println("Introduce un numero del 1 al 100: ");
				intro=entrada.nextInt();
			}
			
			else if(i==2) {
				System.out.println("¡Has fallado! ¡Intentalo de nuevo! (ړײ)");
				System.out.println("Te quedan 3 intentos.\n");
				
				System.out.println("Introduce un numero del 1 al 100: ");
				intro=entrada.nextInt();
			}
			else if(i==3) {
				System.out.println("¡Has fallado! ¡Intentalo de nuevo! (ړײ)");
				System.out.println("Te quedan 3 intentos.\n");
				
				System.out.println("Introduce un numero del 1 al 100: ");
				intro=entrada.nextInt();
			}
			else if(i==4) {
				System.out.println("¡Has fallado! ¡Intentalo de nuevo! (ړײ)");
				System.out.println("Te quedan 2 intentos.\n");
				
				System.out.println("Introduce un numero del 1 al 100: ");
				intro=entrada.nextInt();
			}
			else if(i==5) {
				System.out.println("¡Has fallado! ¡Es tu ultimo intento! (ړײ)");
				System.out.println("¡Piensalo muy bien!\n");
				
				System.out.println("Introduce un numero del 1 al 100: ");
				intro=entrada.nextInt();
			}
		}
	}

}
