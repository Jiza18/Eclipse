package StarWars;
import java.util.Scanner;

public class Nivel1 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);//variable que recibe datos del teclado
		
		int s1 = (int) (Math.random()*10+1);//variable para que genere un numero aleatorio entre 1 y 10, que se mostratra en pantalla como el numero de sistema
		int s2 = (int) (20 + Math.random() * (30-20+1));//variable que genera un numero aleatorio entre 20 y 30, que se mostrara en pantalla como el numero de sector
		
		System.out.println("BIENVENIDO AL NIVEL 1\n");
		System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n"
				+ "sistema "+s1+ " en el sector "+s2+", pero el sistema de navegación está estropeado y el\n"
				+ "computador tiene problemas para calcular parte de las coordenadas de salto.\n"
				+ "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"
				+ "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"
				+ "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n"
				+ "¿Qué debe introducir?");
		
		int sumatoria = 0;//variable que almacenara la sumatoria entre s1 y s2
		while(s1 <= s2) {//bucle que calcula la sumatoria de los numeros entre s1 y s2
			
			sumatoria=sumatoria+s1;
			s1++;
	}
		System.out.println(sumatoria);
		
		int nivel=entrada.nextInt();//variable lee el valor introducido por el usuario
		
		if(nivel==sumatoria) {
			System.out.println("ES CORRECTO!!\n"
							  +"Tu y Chewbacca han logrado calcular el salto y pasan a la siguiente misión.");
		}
		else {
			System.out.println("OH NO!");
			System.out.println("LA NAVE HA CAIDO EN UN AGUJERO NEGRO!");
			System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
					+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
			return;
		}
		
		
		
	}

}
