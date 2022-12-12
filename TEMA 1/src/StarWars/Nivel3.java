package StarWars;
import java.util.Scanner;

public class Nivel3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = (int) (50 + Math.random() * (100-50+1));
		int fact = 1;
		int div = n / 10;
		System.out.println("BIENVENIDO AL NIVEL 3");
		System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n"
				+ "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n"
				+ "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + n + " existentes se\n"
				+ "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n"
				+ "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n"
				+ "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n"
				+ "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n"
				+ "(redondeando N hacia abajo), donde N es el nº de niveles”.\n"
				+ "¿Cual es el nivel correcto?");
		
		for(int i = div; i > 0; i--) {
			
			fact = fact * i;
		}
		
		int nivel3 = entrada.nextInt();
		
		
		if(nivel3 == fact) {
			
			System.out.println("ES CORRECTO!!\n"
							  +"Preparate para la siguiente misión!");
		}
		else {
			System.out.println("OH NO!");
			System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
					+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
			return;
		}
		
	}

}
