package ExerciciosLogica;

/*"Escreva um programa que imprima os números de 1 a 100. Mas para múltiplos de três imprima
'Fizz' em vez do número e para os múltiplos de cinco imprima 'Buzz'. Para números que são múltiplos
de três e cinco imprimir 'FizzBuzz'".
*/

public class fizzBuzz {
	// public static void fizzBuzz(int n) {
	public static void main(String[] args) {

		// laço de repetição e contador
		for (int i = 1; i <= 100; i++) {
			// verifica se é multiplo de 3 e de 5 e faz fizzBuzz ou Fizz
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");
				}
				// verifica se é multiplo de 5 e 3 e faz fizzBuzz ou Buzz
			} else if (i % 5 == 0) {
				if (i % 3 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Buzz");
				}
			}
			// nenhuma das opções
			else {
				System.out.println(i);
			}
		}
	}
}