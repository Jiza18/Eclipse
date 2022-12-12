package StarWars;
import java.util.Scanner;

public class Nivel2 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int p1 = (int) (Math.random()*7+1);
		int p2 = (int) (8 + Math.random() * (12-8+1));
		System.out.println("BIENVENIDO AL NIVEL 2!");
		System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n"
				+ "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n"
				+ "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n"
				+ "agente de espaciopuerto " + p1 + " contactando con nave imperial " + p2 +". No están destinados\n"
				+ "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh...\n"
				+ "tenemos un fallo en el... eh... condensador de fluzo... Solicitamos permiso para\n"
				+ "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n"
				+ "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n"
				+ "manual del piloto que estaba en la guantera y da con la página correcta. El código\n"
				+ "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n"
				+ "¿Cuál es el código?");
		
		int productorio = 1;
		
		while(p1 <= p2) {
			productorio=productorio*p1;
			p1++;
		}
		int lvl2=entrada.nextInt();
		
		if(lvl2==productorio) {
			System.out.println("ES CORRECTO!!\n"
							   +"Tu y Han, lograron calcular el codigo y entran a la estrella de la muerte!");
		}
		else {
			System.out.println("OH NO!");
			System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
					+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
			return;
		}
	}

}
