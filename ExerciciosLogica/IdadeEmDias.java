package ExerciciosLogica;

import java.util.Scanner;

/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/

public class IdadeEmDias {
	public static void main(String[] args) {

		int anos, meses, dias;
		Scanner ler = new Scanner(System.in);

		// Informa��o do que ser� feito.
		System.out.println("Digite sua idade em anos, meses e dias. Retornarei sua idade aproximada em dias.\n");

		// Solicitando informa��o sobre a idade em anos que � armazenada na variavel
		// anos
		System.out.println("Informe quantos anos voc� tem: ");
		anos = ler.nextInt();

		// Solicitando informa��o sobre a idade em meses que � armazenada na variavel
		// meses
		System.out.println("E quantos meses voc� tem: ");
		meses = ler.nextInt();

		// Solicitando informa��o sobre a idade em dias que � armazenada na variavel
		// dias
		System.out.println("E quantos dias voc� tem: ");
		dias = ler.nextInt();

		// calculo da quantidade de dias por ano. Valor fixo de 365 dias por ano � usado
		// e multiplicado pela quantidade de anos informada
		anos = anos * 365;
		// calculo da quantidade de dias por m�s. Valor fixo de 30 dias por m�s � usado
		// e multiplicado pela quantidade de meses informados
		meses = meses * 30;

		// Resposta soma das variaveis que armazenam os valores de anos e meses e dias
		System.out.println("\nSua idade em dias �: " + (anos + meses + dias)
				+".\n\n*Esse calculo desconsidera anos bissextos e meses com 31 dias.");

	}
}
