package ExerciciosLogica;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] arrayUm = { 12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321 };
		int[] arrayDois = { 43, 42, 4, 8, 55, 21, 2, 45 };

		float[] nota = new float[5];
		// 0,1,2,3,4 -> sempre começa pela posição zero

		if (arrayDois.length > 8) {
			System.out.println("Tamanho do arrayDois - maior que 8");
		} else {
			System.out.println("Tamanho do arrayDois - menor que 8");
		}
		System.out.println("\nTamanho do arrayUm - " + arrayUm.length);
		// .length dá o tamanho do array selecionado

		// utilização do for-each -> não precisa do contador,pois vai percorrer todo
		// array
		String[] cars = { "Volvo", "", "Ford", "Mazda" };

		for (String i : cars) {
			System.out.println(i);
		}

		// populando um array
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com uma nota: ");
			nota[i] = entrada.nextFloat();
		}

		// apresentando um array
		for (int i = 0; i < 5; i++) {
			System.out.println("Nota " + i + 1 + "=" + nota[i]);
		}

	}
}