package ExerciciosLogica;

import java.util.Scanner;

/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/

public class IdadeEmAnos {
	public static void main(String[] args) {

		int dias, anos;
		Scanner ler = new Scanner(System.in);

		// Informa��o do que ser� feito.
		System.out.println("Digite sua idade em dias. Retornarei sua idade em anos.\n");

		// Solicitando informa��o sobre a idade em dias que � armazenada na variavel
		// dias
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();

		// calculo da quantidade de anos. Quantidade de dias informada � dividida pelo
		// valor fixo de 365 dias por ano
		anos = dias / 365;

		System.out.println("\nSua idade em anos �: " + anos);
	}
}
