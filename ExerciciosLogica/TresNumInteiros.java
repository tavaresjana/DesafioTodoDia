package ExerciciosLogica;

import java.util.Scanner;

/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
 * D= R+S/2 
 * R=(A+B)^2
 * S=(B+C)^2 */

public class TresNumInteiros {
	public static void main(String[] args) {

		double a, b, c, r, s, d;
		Scanner ler = new Scanner(System.in);

		// solicitando valor para armanezar na variavel
		System.out.println("Informe um n�mero inteiro e positivo: ");
		a = ler.nextInt();
		// solicitando valor para armanezar na variavel
		System.out.println("Informe um n�mero inteiro e positivo: ");
		b = ler.nextInt();
		// solicitando valor para armanezar na variavel
		System.out.println("Informe um n�mero inteiro e positivo: ");
		c = ler.nextInt();

		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);

		d = (r + s) / 2;

		System.out.println("Resultado da equa��o �: " + d);
	}
}