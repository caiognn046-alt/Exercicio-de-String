package pctExercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("escreva algo que escreverei alcontrario");
		String txt = ler.nextLine();
		String nao = txt.replace("\\n+", "").toLowerCase();
		String inv = new StringBuilder(nao).reverse().toString();
			if(nao.equals(inv));
			System.out.println(inv);
	}
	
}
