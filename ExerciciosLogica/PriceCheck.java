package ExerciciosLogica;

/*Price Check teste*/
import java.awt.Dimension;
import java.util.HashMap;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PriceCheck {
	public static void main(String[] args) {

//valores do exerc�cio
		String[] produto = { "eggs", "milk", "cheese" };
		float[] produtoPreco = { 2.89f, 3.29f, 5.79f };
		// float[] produtoPreco = { 2.89f, 2.99f, 5.97f, 3.29f };

		String[] produtoVendido = { "eggs", "eggs", "cheese", "milk" };
		float[] precoVendido = { 2.89f, 2.99f, 5.97f, 3.29f };
		// Por padr�o, o Java assume valores decimais como double. Pra especificar que �
		// um 'float', coloque aquele 'f' ao final.

		// Tamanho do array de produtos
		System.out.println("\nTamanho do array de Produtos = " + produto.length);
		// Elementos do array de produtos
		for (String n : produto) {
			System.out.println("Produtos = " + n);
		}

		// Tamanho do array de pre�o produtos
		System.out.println("\nTamanho do array de Pre�o de produtos = " + produtoPreco.length);
		// Elementos do array de pre�o produtos
		for (float n : produtoPreco) {
			System.out.println("Pre�o dos produtos = " + n);
		}

		// Tamanho do array de produtos vendidos
		System.out.println("\nTamanho do array de Produtos vendidos = " + produtoVendido.length);
		// Elementos do array de produtos vendidos
		for (String m : produtoVendido) {
			System.out.println("Produtos vendidos = " + m);
		}

		// Tamanho do array de pre�o vendido
		System.out.println("\nTamanho do array de Pre�o de produtos = " + precoVendido.length);
		// Elementos do array de pre�o vendido
		for (float m : precoVendido) {
			System.out.println("Pre�o vendido = " + m);
		}

		boolean a;
		a = Arrays.equals(produtoPreco, precoVendido);

		if (a == false) {
			System.out.println("\nO pre�o da lista de produtos e lista de produtos vendidos n�o � igual");
		} else {
			System.out.println("\nO pre�o da lista de produtos e lista de produtos vendidos � igual");
		}

	}

}