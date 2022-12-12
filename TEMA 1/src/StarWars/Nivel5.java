package StarWars;
import java.util.Scanner;

public class Nivel5 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int M=(int) (5 + Math.random() * (10-5+1));
		int S=(int) (5 + Math.random() * (10-5+1));
		int fact=1;
		int fact2=1;
		int suma=0;
		
		System.out.println("BIENVENIDO AL NIVEL FINAL!");
		System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
				+ "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n"
				+ "explote en exactamente " + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar\n"
				+ "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
				+ "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
				+ "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n"
				+ "el factorial de " + M + " y el factorial de " + S + ". ¿Qué valor debe introducir?");
		
		
		for(int i=M;i>0;i--) {
			
			fact=fact*i;
	}
		
		for(int i=S;i>0;i--) {
			
			fact2=fact2*i;
		
		}
		
		suma=fact+fact2;
		
		int nivel5=entrada.nextInt();
		
		if(nivel5==suma) {
			System.out.println("ES CORRECTO!!");
			
		}
		
		else {
			System.out.println("OH NO!");
			System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
					+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
			return;
		}
		
	}

}
