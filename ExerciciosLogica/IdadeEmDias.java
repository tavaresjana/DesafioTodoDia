package ExerciciosLogica;

import java.util.Scanner;

/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/

public class IdadeEmDias {
	public static void main(String[] args) {

		int anos, meses, dias;
		Scanner ler = new Scanner(System.in);

		// Informação do que será feito.
		System.out.println("Digite sua idade em anos, meses e dias. Retornarei sua idade aproximada em dias.\n");

		// Solicitando informação sobre a idade em anos que é armazenada na variavel
		// anos
		System.out.println("Informe quantos anos você tem: ");
		anos = ler.nextInt();

		// Solicitando informação sobre a idade em meses que é armazenada na variavel
		// meses
		System.out.println("E quantos meses você tem: ");
		meses = ler.nextInt();

		// Solicitando informação sobre a idade em dias que é armazenada na variavel
		// dias
		System.out.println("E quantos dias você tem: ");
		dias = ler.nextInt();

		// calculo da quantidade de dias por ano. Valor fixo de 365 dias por ano é usado
		// e multiplicado pela quantidade de anos informada
		anos = anos * 365;
		// calculo da quantidade de dias por mês. Valor fixo de 30 dias por mês é usado
		// e multiplicado pela quantidade de meses informados
		meses = meses * 30;

		// Resposta soma das variaveis que armazenam os valores de anos e meses e dias
		System.out.println("\nSua idade em dias é: " + (anos + meses + dias)
				+".\n\n*Esse calculo desconsidera anos bissextos e meses com 31 dias.");

	}
}
