package StarWars;
import java.util.Scanner;

public class Nivel4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int p = (int) (10 + Math.random() * (100-10*1));
		
		int conte = 2;
		int prime=1;
		
		System.out.println("BIENVENIDO AL NIVEL 4!!");
		System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n"
				+ "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n"
				+ "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n"
				+ "verificar si el número " + p + " es primo o no. Si es primo introduce un 1, si no lo es\n"
				+ "introduce un 0.");
		
		
        int contador,I,numero;
        int bandera=1;


        numero = p; 

        contador = 0;

        for(I = 1; I <= numero; I++){

            if((numero % I) == 0){
                contador++;
            }
            
        }
        
        int nivel3=0;
        nivel3=entrada.nextInt();
        
        if(contador <= 2) {

            bandera=1;

        }
        else{

            bandera=0;
        }
        
        if(nivel3==bandera) {
        	System.out.println("ES CORRECTO!!\n"
        					  +"Preparate para el nivel final!");
        }
        else {
        	System.out.println("OH NO!");
			System.err.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
					+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
			return;
        }
			
	}

}
