package Tasca;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		int opcion;
		Scanner entrada=new Scanner(System.in);
		do {     //interfaz del menu
		System.out.println(" __^__                                      __^__\n"
				+ "( ___ )------------------------------------( ___ )\n"
				+ " | / |                                      | \\ |\n"
				+ " | / |          Menu de opciones.           | \\ |\n"
				+ " |___|                                      |___|\n"
				+ "(_____)------------------------------------(_____)");
		
		System.out.println("1.Tirar 3 dados.");
		System.out.println("2.Generar una carta aleatoria de la baraja francesa.");
		System.out.println("3.Generar 50 numeros aleatorios entre 100 y 199.");
		System.out.println("4.Intenta adivinar el numero.");
		System.out.println("5.Generar numeros hasta que aparezca un 24");
		System.out.println("6.Salir.");
		System.out.print("Introduce una opcion: ");
		
		opcion=entrada.nextInt();
		
		switch(opcion) {
		
		case 1://tirar 3 dados
			
			System.out.println("Has sacado: ");
			
			
			int dados;
			int suma=0;
			for (int i = 1; i <= 3; i++) {//bucle para que se repita la instruccion 3 veces (3 dados)
				dados=(int) (Math.random()*6+1);//generar un numero entre 1 y 6 (el dado)
				System.out.print(dados + " ");//imprimir el numero generado
				suma+=dados;//total de los 3 dados
				}
			System.out.println("\n\nEl total de tus dados es: "+suma+"\n");
			break;
			
		case 2://generar una carta aleatoria
			String mazo = "";//variable que almacena el nombre del mazo 
		    String carta = "";//variable que almacena el valor de la carta
		    
		    int nomMazo = (int)(Math.random()*4) + 1;//calcular un numero del 1 al 4
		    
		    switch(nomMazo) {//denominar el mazo segun el numero generado
		      case 1:
		        mazo = "picas";
		        break;
		      case 2:
		        mazo = "corazones";
		        break;
		      case 3:
		        mazo = "diamantes";
		        break;
		      case 4:
		        mazo = "tréboles";
		      default:
		    }

		    int numeroCarta = (int)(Math.random()*13) + 1;//generar un numero del 1 al 13
		    
		    switch(numeroCarta) {//denominar el valor de la carta segun el numero generado
		      case 1:
		        carta = "A";
		        break;
		      case 11:
		        carta = "J";
		        break;
		      case 12:
		        carta = "Q";
		        break;
		      case 13:
		        carta = "K";
		        break;
		      default:
		        carta = String.valueOf(numeroCarta);
		    }
		    
		    System.out.println("Tu carta es: "+carta + " de " + mazo+"\n");
		    break;
		    
		case 3://generar 50 numeros del 100 al 199
			int max=-1000;
			int min=1000;
			int antesmedia=0;//variable para sumar todos los numeros
			int div=50;//variable para calcular la media 
			int media=0;
			int x;
			for(int i=0;i<=50;i++) {
				int num=(int) (100+Math.random()*(199-100+1));
				System.out.println(num+" ");
				
				if(num>max) {
					max=num;
				}
				else if(num<min) {
					min=num;
				}
				
				antesmedia+=num;
				
				
			}
			media=antesmedia/div;
			System.out.println("El mayor es "+max+",  el menor es "+min+" y la media es "+media+"\n");
			break;
			
		case 4://intetar adivinar un numero
			int num = (int) ((Math.random() * 100)+1);//generar y almacenar un numero del 1 al 100
			
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
			
			for (int i=0; i<=5; i++) {//bucle para que pida 5 veces un numero (los 5 intentos)
				
				if(intro==num) {
					System.out.println("¡Has acertado! ＼(＾O＾)／\n");
					break;
				}
				else if (i == 5) { 
				      System.out.println("Lo siento: ¡has perdido!. El número era el: " + num+" ¯\\_(ツ)_/¯\n"); 
				      break; }
				
				else if (num > intro)//condicion para comprobar si es mayor a la variable num 
				      System.out.println("El número secreto es MAYOR que " + intro);
				
					else if (num < intro)//condicion para comprobar si es menor a la variable num
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
					System.out.println("Te quedan 2 intentos.\n");
					
					System.out.println("Introduce un numero del 1 al 100: ");
					intro=entrada.nextInt();
				}
				else if(i==4) {
					System.out.println("¡Has fallado! ¡Es tu ultimo intento! (ړײ)");
					System.out.println("¡Piensalo muy bien!\n");
					
					System.out.println("Introduce un numero del 1 al 100: ");
					intro=entrada.nextInt();
				}

				
			}
			break;
		case 5://generar numeros hasta que aparezca 24
			int compta=0;//variable que almacena la cantidad de numeros generados
			int nume;
			
			do {//bucle do-while para que se imprima al menos una vez el numero (en caso de generarse 24 a la primera)
				nume= ((int) (Math.random()*100));
				System.out.println(nume);
				compta++;//por cada numero generado aumenta la variable contador
				if(nume==24) {//condicion para que muestre en pantalla cuando el programa finalice
					System.out.println("¡LISTO!");
				}
			}
			while(nume!=24);//para que finalice cuando se genere un 24
			
			System.out.println("El total de numeros introducidos antes del 24 es: "+compta+"\n");
			break;
			
		case 6://salir
			System.err.println("Haz elegido la opcion SALIR");
			System.out.println("¡Hasta luego!");
			break;
			default:
				System.out.println("Selecciona una opcion correcta.");
		}
		}
		while(opcion!=6);
	}

}
