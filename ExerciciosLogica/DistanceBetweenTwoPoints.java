package ExerciciosLogica;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double x1, x2, y1, y2, somaY, somaX,soma, d;

		System.out.println("Informe um valor para x1: ");
		x1 = ler.nextDouble();

		System.out.println("Informe um valor para y1: ");
		y1 = ler.nextDouble();

		System.out.println("Informe um valor para x2: ");
		x2 = ler.nextDouble();

		System.out.println("Informe um valor para y2: ");
		y2 = ler.nextDouble();

		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("\nResultado: "+d);
		
		System.out.println("Número com apenas 4 casas após o ponto decimal: "+String.format("%.4f", d));
	}
}
