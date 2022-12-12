package StarWars;
import java.util.Scanner;

public class StarWarsGame {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int niveles=0;
		
		switch(niveles) {//switch para controlar el paso de los niveles
		
		case 0://inicio del programaba, bienvenida al usuario
			
			System.out.println("\n"
					+ "░██████╗████████╗░█████╗░██████╗░  ░██╗░░░░░░░██╗░█████╗░██████╗░░██████╗\n"
					+ "██╔════╝╚══██╔══╝██╔══██╗██╔══██╗  ░██║░░██╗░░██║██╔══██╗██╔══██╗██╔════╝\n"
					+ "╚█████╗░░░░██║░░░███████║██████╔╝  ░╚██╗████╗██╔╝███████║██████╔╝╚█████╗░\n"
					+ "░╚═══██╗░░░██║░░░██╔══██║██╔══██╗  ░░████╔═████║░██╔══██║██╔══██╗░╚═══██╗\n"
					+ "██████╔╝░░░██║░░░██║░░██║██║░░██║  ░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║██████╔╝\n"
					+ "╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝  ░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░");
			
			System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
					+ "Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa Leia, Luke\n"
					+ "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n"
					+ "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n"
					+ "está construyendo para destruirla. (Presiona Intro para continuar)");
			
			String enter=entrada.nextLine();//creacion de la variable que leera cuando el usuario presione enter
			
		case 1://nivel 1
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
			System.out.println(sumatoria);//para que no pienses Jaume
			
			int nivel=entrada.nextInt();//variable lee el valor introducido por el usuario
			
			if(nivel==sumatoria) {//condicion que evalua si el valor que introduce el usuario es correcto
				System.out.println("ES CORRECTO!!\n"
								  +"Tu y Chewbacca han logrado calcular el salto y pasan a la siguiente misión.");
			}
			else {//perder
				System.out.println("OH NO!");
				System.out.println("LA NAVE HA CAIDO EN UN AGUJERO NEGRO!");
				System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
						+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
				return;
			}
			
		case 2://nivel2
			int p1 = (int) (Math.random()*7+1);//variable que genera un numero aleatorio entre 1 y 7
			int p2 = (int) (8 + Math.random() * (12-8+1));//variable que genera un numero aleatorio entre 8 y 12
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
			
			int productorio = 1;//variable contador
			
			while(p1 <= p2) {//bucle para calcular el productorio de los numeros
				productorio=productorio*p1;
				p1++;
			}
			System.out.println(productorio);//para que no pienses Jaume
			
			int nivel2=entrada.nextInt();//ingreso del valor por teclado (usuario)
			
			if(nivel2==productorio) {//variable que calcula si es valor introducido por el usuario es correcto
				System.out.println("ES CORRECTO!!\n"
								   +"Tu y Han, lograron calcular el codigo y entran a la estrella de la muerte!");
			}
			else {//perder
				System.out.println("OH NO!");
				System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
						+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
				return;
			}
		case 3://nivel 3
			int n = (int) (50 + Math.random() * (100-50+1));//variable que genera un numero aleatorio del 50 al 100
			int fact = 1;//variable que almacena el calculo del factorial
			int div = n / 10;//variable que almacena la formula requerida por el ejercicio
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
			
			for(int i = div; i > 0; i--) {//bucle que calcula el factorial del numero aleatorio/10
				
				fact = fact * i;
			}
			
			System.out.println(fact);//para que no pienses Jaume
			
			int nivel3 = entrada.nextInt();//solicitud del valor al usuario
			
			
			if(nivel3 == fact) {//condicion para comprobar si el usuario introdujo el valor correcto
				
				System.out.println("ES CORRECTO!!\n"
								  +"Preparate para la siguiente misión!");
			}
			else {//perder
				System.out.println("OH NO!");
				System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
						+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
				return;//si el valor es incorrecto el programa finaliza
			}
		case 4://nivel 4
			int p = (int) (10 + Math.random() * (100-10*1));//variable que genera un numero aleatorio entre 10 y 100
			
			
			System.out.println("BIENVENIDO AL NIVEL 4!!");
			System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n"
					+ "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n"
					+ "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n"
					+ "verificar si el número " + p + " es primo o no. Si es primo introduce un 1, si no lo es\n"
					+ "introduce un 0.");
			
			
	        int contador,I,numero;//variables del bucle
	        int bandera=1;//variable centinela para usarla en las condiciones


	        numero = p;//variable auxiliar

	        contador = 0;

	        for(I = 1; I <= numero; I++){//bucle que calcula si el  numero es primo o no

	            if((numero % I) == 0){
	                contador++;
	            }
	            
	        }
	        
	        int nivel4=0;
	        
	        if(contador <= 2) {//condicion que que cambia el valor de la variable centinela segun el resultado del calculo en el bucle

	            bandera=1;
	            
	            System.out.println("Primo");//para que no pienses Jaume

	        }
	        else{

	            bandera=0;
	            
	            System.out.println("No es primo");//para que no penses Jaume
	        }
	        
	        nivel4=entrada.nextInt();
	        
	        if(nivel4==bandera) {//condicion que evalua si el valor introducido por el ususario es correcto o no
	        	System.out.println("ES CORRECTO!!\n"
	        					  +"Preparate para el nivel final!");
	        }
	        else {//perder
	        	System.out.println("OH NO!");
				System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
						+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
				return;
	        }
	        
		case 5://nivel 5

			int M=(int) (5 + Math.random() * (10-5+1));//variable que genera un numero aleatorio entre 5 y 10
			int S=(int) (5 + Math.random() * (10-5+1));//variable que genera un numero aleatorio entre 5 y 10
			int fact1=1;//variable contador para el factorial del primer numero (M)
			int fact2=1;//variable contador para el factorial del segundo numero (S)
			int suma=0;//variable para la suma de los factoriales
			
			System.out.println("BIENVENIDO AL NIVEL FINAL!");
			System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
					+ "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n"
					+ "explote en exactamente " + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar\n"
					+ "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
					+ "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
					+ "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n"
					+ "el factorial de " + M + " y el factorial de " + S + ". ¿Qué valor debe introducir?");
			
			
			for(int i=M;i>0;i--) {//bucle que calcula el factorial de M
				
				fact1=fact1*i;
		}
			
			for(int i=S;i>0;i--) {//bucle que calcula el facotiral de S
				
				fact2=fact2*i;
			
			}
			
			suma=fact1+fact2;//suma de los 2 factoriales M y S
			
			System.out.println(suma);//para que no pienses Jaume
			
			int nivel5=entrada.nextInt();//solicitud al usuario por teclado
			
			if(nivel5==suma) {//Condicion que evalua si el valor introducido por el usuario es correcto 
				System.out.println("ES CORRECTO!!");
				
			}
			
			else {//perder
				System.out.println("OH NO!");
				System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
						+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
				return;
			}
			
		case 6: //Ganar el juego
			System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n"
					+ "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n"
					+ "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n"
					+ "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n"
					+ "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n"
					+ "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n"
					+ "imperio.");
			System.out.println("¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
			
		case 7://fin
			System.out.println("Gracias por jugar :D");
			return;
		}
	}

}
