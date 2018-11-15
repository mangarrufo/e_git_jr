
package prueba_git_raul;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		int contador = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Hasta donde quieres que cuentes?");
		while (!teclado.hasNextInt()) {
			System.out.println("Tiene que ser un entero");
			teclado.next();
		}
		contador = teclado.nextInt();
		System.out.println("");
		for (int i = 1; i <= contador; i++) {
			System.out.print(i + " ");
		}
		teclado.close();
	}

}
