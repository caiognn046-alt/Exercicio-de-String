package exercicioString01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite a String");
		String txt = ler.nextLine();
		int tamanho = txt.length();
		System.out.println(tamanho);
		System.out.println(txt.toUpperCase());
		int vogal = 0;
		String minusculo = txt.toLowerCase();
		for(int i = 0; i<minusculo.length(); i++ ) {
			char c = minusculo.charAt(i);
			if(c == 'a'|| c == 'e'||c == 'i'||c == 'o'||c == 'u') {
				vogal++;
			}
		}
		
		
		System.out.println(vogal);
		
		
		
		
		ler.close();

	}

}
