package ExerciciosLogica;

/*"Escreva um programa que imprima os n�meros de 1 a 100. Mas para m�ltiplos de tr�s imprima
'Fizz' em vez do n�mero e para os m�ltiplos de cinco imprima 'Buzz'. Para n�meros que s�o m�ltiplos
de tr�s e cinco imprimir 'FizzBuzz'".
*/

public class fizzBuzz {
	// public static void fizzBuzz(int n) {
	public static void main(String[] args) {

		// la�o de repeti��o e contador
		for (int i = 1; i <= 100; i++) {
			// verifica se � multiplo de 3 e de 5 e faz fizzBuzz ou Fizz
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");
				}
				// verifica se � multiplo de 5 e 3 e faz fizzBuzz ou Buzz
			} else if (i % 5 == 0) {
				if (i % 3 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Buzz");
				}
			}
			// nenhuma das op��es
			else {
				System.out.println(i);
			}
		}
	}
}