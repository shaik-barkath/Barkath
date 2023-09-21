package com.kn.selection;
import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Take input from end user
		System.out.println("Enter a Character");
		// Initializing a Variable
		char alphabet = scan.next().charAt(0);
		// Calling a method
		checkVowelOrConsonent(alphabet);
		scan.close();
	}

	public static void checkVowelOrConsonent(char alphabet) {
		// checking the condition
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
				|| alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
			// printing a Success message
			System.out.println("Character " +alphabet+ " is Vowel");
		} else {
			// printing a Failure message
			System.out.println("Character " +alphabet+ " is Consonent");
		}
	}

}
