package Introduccion;

public class IncrementoDeDatos {
	public static void main(String args[]) {
		
		System.out.println("***********");
		System.out.println("EJECICIO 1");
		System.out.println("***********");
		
		/*Exercici 1: Si x és una variable de tipus int amb valor 10, determina què es mostra per
		 * pantalla quant s’executen les següents instruccions:
		 */

		int x=10;
		
		System.out.println(x);
		x++;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(++x);
		++x;
		x++;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(++x);
		
		System.out.println("\n\n");
		
		System.out.println("************");
		System.out.println("EJERCICIO 2");
		System.out.println("************");
		
		/*Exercici 2: Declarades les variables A i B de tipus char, calcula què es mostra per pantalla
		 *quan executem les següents instruccions:
		 */
		
		char A='c';
		char B;
		System.out.println(A++);
		System.out.println(A++);
		System.out.println(++A);
		B = --A;
		System.out.println(++A);
		A++;
		--B;
		System.out.println(B++);
		System.out.println(++B);
		System.out.println(++A);
		System.out.println(B--);
		System.out.println(A);
		System.out.println(B);
		
		System.out.println("\n\n");
		
		System.out.println("************");
		System.out.println("EJERCICIO 3");
		System.out.println("************");
		System.out.println();
		
		//Exercici 3: Un programa Java conté les següents declaracions i assignacions inicials:
		
		int i=1,j=1,k=1;
		
		/*Determina el valor final de les tres variables en cadascuna de les següents instruccions. Les
		 *instruccions són independents les unes de les altres, és a dir, el valor inicial de les variables en
		 *cada instrucció és i = 1, j = 1, k = 1. 
		 */
		
		System.out.println("**********");
		System.out.println("a)i= ++j");
		System.out.println("**********");
		System.out.println();
		
		i=++j;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("b)i= k++");
		System.out.println("**********");
		System.out.println();
		
		i=k++;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("c)i= k+ ++j");
		System.out.println("**********");
		System.out.println();
		
		i= k+ ++j;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("d)i=i+ j++");
		System.out.println("**********");
		System.out.println();
		
		i=i+ j++;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("e)i=j+ ++k");
		System.out.println("**********");
		System.out.println();
		
		i=j+ ++k;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("f)i=++j + k++");
		System.out.println("**********");
		System.out.println();
		
		i=++j + k++;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("g)j=k-- + --i");
		System.out.println("**********");
		System.out.println();
		
		j=k-- + --i;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("h)i=k+1+ ++j");
		System.out.println("**********");
		System.out.println();
		
		i=k+1+ ++j;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("i)i=++i + --j + k--");
		System.out.println("**********");
		System.out.println();
		
		i=++i + --j + k--;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		System.out.println("**********");
		System.out.println("j)k=j-- + ++k");
		System.out.println("**********");
		System.out.println();
		
		k=j-- + ++k;
		System.out.println("Los valores son: "+"i="+i+" j="+j+" k="+k);
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
