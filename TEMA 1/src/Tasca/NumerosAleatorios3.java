package Tasca;

public class NumerosAleatorios3 {
	public static void main(String[] args) {
		
		int max=-1000;
		int min=1000;
		int antesmedia=0;
		int div=50;
		int media=0;
		int x;
		for(int i=0;i<=50;i++) {
			int num=(int) (100+Math.random()*(199-100+1));
			System.out.println(num+" ");
			
			if(num>max) {
				max=num;
			}
			else if(num<min) {
				min=num;
			}
			
			antesmedia+=num;
			
			
		}
		media=antesmedia/div;
		System.out.println("El mayor es "+max+",  el menor es "+min+" y la media es "+media);
	}

}
