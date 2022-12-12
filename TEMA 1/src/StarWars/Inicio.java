package StarWars;
import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);//variable que recibe datos del teclado
		
		System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
				+ "Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa Leia, Luke\n"
				+ "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n"
				+ "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n"
				+ "está construyendo para destruirla. (Presiona Intro para continuar)");
		
		String enter=entrada.nextLine();//creacion de la variable que leera cuando el usuario presione enter
		
		
	}

}
