package exercicioString02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite a String ");
		String txt = ler.nextLine();
	String nao = txt.replace("\\n+", "").toLowerCase();
	String inv = new StringBuilder(nao).reverse().toString();
		if(nao.equals(inv)) {
			System.out.println("É um palidromo");
		}else {
				System.out.println("é nao é um palidromo");
		System.out.println(inv);
		ler.close();
		}

	}

}
