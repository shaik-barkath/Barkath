package com.kn.selection;
import java.util.Scanner;

public class CheckingAlphabetRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Take input from end user
		System.out.println("Ente"
				+ "r any Alphabet");
		// Initializing a Variable
		char alphabet = scan.next().charAt(0);
		// Calling a method
		checkingAlphabetRange(alphabet);
		scan.close();
	}

	public static void checkingAlphabetRange(char alphabet) {
		// checking the condition
		if (alphabet >= 65 && alphabet <= 90) {
			// printing a Success message
			System.out.println("It is in Upper case");
		} else if(alphabet >= 97 && alphabet <= 122){
			// printing a Failure message
			System.out.println("It is in Lower case");

		}else {
			System.out.println("It is a Number");
			
		}
	}

}
