package Tasca;
import java.util.Scanner;	
public class MenuDeOpciones {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int opcion;
		do {
			
			System.out.println("******************************");
			System.out.println("*******MENU DE OPCIONES*******");
			System.out.println("******************************");
			
			System.out.println("1.Intercambiar dos valores");
			System.out.println("2.Sumar");
			System.out.println("3.Máximo y mínimo");
			System.out.println("4.Números primos");
			System.out.println("5.Salir");
			System.out.println("____________________");
			System.out.print("Introduce una opcion: ");
			
			opcion=entrada.nextInt();
			
			switch(opcion) {
			
			case 1: //intercambiar 2 valores
				System.out.println("Has seleccionado la opción 1.");
				System.out.println("Introduce el primer valor: ");
				
				int valor1=entrada.nextInt();
				
				System.out.println("Introduce el segundo valor: ");
				
				int valor2=entrada.nextInt();
				
				System.out.println("El primer valor es "+valor2+" y el segundo es "+valor1);
				
				break;
				
			case 2: //suma
				System.out.println("Has seleccionado la opción 2.");
				System.out.println("Introduce el primer numero:");
				
				float num1=entrada.nextInt();
				
				System.out.println("Introduce el segundo numero:");
				
				float num2=entrada.nextInt();
				float suma=0;
				
				while(num1<=num2) {
						
						suma=suma+num1;
						num1++;
				}
				System.out.println("El resultado de la suma es: "+suma);
				
				break;
				
			case 3: //maximo y minimo
				System.out.println("Has seleccionado la opción 3.");
				
				int max=-1000;
				int min=1000;
				int x;
				
				System.out.print("Introduce un numero y presiona ENTER, para finalizar el programa introduzca el numero 0: ");
				x=entrada.nextInt();
				
				do {
					if(x>max) {
					max=x;
					}
					if(x<min) {
					min=x;
					}
					System.out.print("Introduce un numero y presiona ENTER, para finalizar el programa introduzca el numero 0: ");
					x=entrada.nextInt();
				}
				while(x!=0);
				
				
				System.out.println("El máximo es "+max+" y el minimo es "+min);
				
				
				break;
				
			case 4: //numeros primos
				System.out.println("Has seleccionado la opcion 4.");
				int nume;
				boolean prime=true;
				System.out.println("Introduce un numero entero positivo: ");
				
				nume=entrada.nextInt();
				
				
					for(int p=2;p<=nume;p++) {
						prime=true;
						for(int conte=2;conte<p;conte++) {
							if(p%conte==0) {
								prime=false;
							}
						}
						if(prime) {
							System.out.print(p+" ");
						}
					}
					System.out.println();
					break;
					
			
					
	
			
			
				
				
				
			case 5: //salida
				System.err.println("Haz elegido la opcion SALIR");
				System.out.println("¡Hasta luego!");
				
				
			}
		}
		while(opcion!=5);
	}

}
