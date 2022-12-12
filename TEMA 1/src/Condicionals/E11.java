package Condicionals;
import java.util.Scanner;

public class E11 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int par=0;
		int impar=0;
		int i=100;
		int suma=0;
		int suma1=0;
		
		while(i<=200) {
			
			if(i%2==0) {
				par=i;
				suma=suma+par;
				
			}
			
			else if(i%2!=0) {
				impar=i;
				suma1=suma1+impar;
			}
			i++;
		}
		System.out.println("El resutaldo de la suma de los numeros pares es: "+suma);
		System.out.println("El resultado de la suma de los numeros impares es: "+suma1);
	}

}
