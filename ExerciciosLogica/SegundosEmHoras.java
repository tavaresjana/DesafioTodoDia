package ExerciciosLogica;

import java.util.Scanner;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class SegundosEmHoras {
	public static void main(String[] args) {
		
		double segundos, horas;
		Scanner ler = new Scanner(System.in);
		
		// Informa��o do que ser� feito.
		System.out.println("Digite a dura��o em segundos do seu envento e retornarei em horas.\n");
		
		System.out.println("Informe a dura��o em segundos do seu evento: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		
		System.out.println("\nA dura��o do seu evento foi de aproximadamente: "+horas+" horas.");
		
		
	}
}
