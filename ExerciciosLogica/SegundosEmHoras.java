package ExerciciosLogica;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class SegundosEmHoras {
	public static void main(String[] args) {
		
		double segundos, horas;
		Scanner ler = new Scanner(System.in);
		
		// Informação do que será feito.
		System.out.println("Digite a duração em segundos do seu envento e retornarei em horas.\n");
		
		System.out.println("Informe a duração em segundos do seu evento: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		
		System.out.println("\nA duração do seu evento foi de aproximadamente: "+horas+" horas.");
		
		
	}
}
