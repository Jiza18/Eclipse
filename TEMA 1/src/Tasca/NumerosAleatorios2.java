package Tasca;
import java.util.Scanner;
public class NumerosAleatorios2 {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
	    String mazo = "";
	    String carta = "";
	    
	    int nomMazo = (int)(Math.random()*4) + 1;
	    
	    switch(nomMazo) {
	      case 1:
	        mazo = "picas";
	        break;
	      case 2:
	        mazo = "corazones";
	        break;
	      case 3:
	        mazo = "diamantes";
	        break;
	      case 4:
	        mazo = "tréboles";
	      default:
	    }

	    int numeroCarta = (int)(Math.random()*13) + 1;
	    
	    switch(numeroCarta) {
	      case 1:
	        carta = "A";
	        break;
	      case 11:
	        carta = "J";
	        break;
	      case 12:
	        carta = "Q";
	        break;
	      case 13:
	        carta = "K";
	        break;
	      default:
	        carta = String.valueOf(numeroCarta);
	    }
	    
	    System.out.println(carta + " de " + mazo);
	}


}