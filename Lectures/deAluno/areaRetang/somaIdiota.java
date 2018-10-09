
package testeee;

import java.util.Scanner;

public class somaIdiota {
	public static void main(String[] src) {

		int numero1;
		int numero2;
		int resultado;
		var scanner = new Scanner(System.in); //scanf
		
		
		System.out.println("Por favor digite o numero um depois o numero 2");
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		
		resultado = numero1 + numero2;
		System.out.println("o resultado é: " +resultado);
		
	}
}
