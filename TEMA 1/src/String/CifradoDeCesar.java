package String;
import java.util.*;

public class CifradoDeCesar {
	public static void main(String[] args) {
		
		//Jose Miguel Izarra
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("================");
		System.out.println("Cifrado de Cesar");
		System.out.println("================");
		
		
		char a = 97;//variable que almacena el minimo en codigo ASCII que se puede introducir
		char z = 122;//variable que almacena el minimo en codigo ASCII que se puede introducir
		
		System.out.print("Introduce el mensaje a cifrar: ");
		
		String nombre = entrada.nextLine().toLowerCase();//solicitud de el mensaje a cifrar al usuario y convertir todo en minusculas
		
		for(int x = 0; x < nombre.length(); x++) {//bucle para para que almacene los espacios en blanco y evalue si el caracter introducido es una letra o no
			
			if((boolean) (nombre.charAt(x) == ' ')) {}
			
			else if((boolean) (nombre.charAt(x) < a)||(boolean) (nombre.charAt(x) > z)) {
				
				System.err.println("Error solo puedes introducir letras. Reinicia el programa.");
				return;
			}
			
		}
		
		System.out.print("Introduce la clave de cifraje: ");
		
		int clave = entrada.nextInt();//solicitud de la clave de cifraje al usuario
		
		char cifrado[] = nombre.toCharArray();//variable que almacenara la frase en un array 
		
		char cifrado2[] = new char [nombre.length()];//variable que almacenara el cifrado 
		
			
			for(int b = 0; b < cifrado2.length; b++) {			/*bucle que evalua si hay algun espacio y lo mantiene, controla que el 
																cifrado no se salga de los caracters aceptados (abecedario ingles)
																y asigna las letras correspondientes al cifrado, con la clave que elegió le usario
																es decir este bucle se encarga de correr las letras*/
				
				
				if(String.valueOf(cifrado[b]).equals(" ") ) {
					
					cifrado2[b] = cifrado[b];
					
				}
				else {
					
					if((cifrado[b] + clave) > z) {
						
						cifrado2[b] = (char) ((cifrado[b] + clave) - 26);
					}
					
					else if((cifrado[b] + clave) < a) {
						
						cifrado2[b] = (char) ((cifrado[b] + clave) + 26);
					}
					else {
						cifrado2[b] = (char) (cifrado[b] + clave);
					}
				}
				System.out.print(cifrado2[b]);//impresión del cifrado
			
		}
			System.out.println("\n\nPrograma desarrollado por Jose Miguel Izarra©");
	}

}
