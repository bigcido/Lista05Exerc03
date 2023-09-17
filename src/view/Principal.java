package view;

import java.util.Scanner;
import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController pc = new PalindromoController();
		Scanner scan = new Scanner(System.in);
		String palavra;
		
		System.out.print("Digite a palavra: ");
		palavra = scan.nextLine();
		
		if (pc.ehPalindromo(palavra)) {
			System.out.println(palavra+ " e palindromo");
		} else {
			System.out.println(palavra+ " não e palindromo");
		}
		
		scan.close();
	}

}
