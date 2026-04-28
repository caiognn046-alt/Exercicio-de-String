package pctExercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("escreva 1s e 0 e eu direi a quantidade de 1s");
		int num = 0;
		String numero = ler.nextLine();
		for(int i = 0; i<numero.length(); i++ ) {
			char c = numero.charAt(i);
			if(c == '1') {
				num++;
				System.out.println(num);
			}
		}
		
		ler.close();
	}

	}
