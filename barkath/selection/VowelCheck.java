package com.kn.selection;
import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a Character = ");
    char alphabet = scan.next().charAt(0);
    scan.close();
    if( alphabet == 'a'|| alphabet == 'e'|| alphabet == 'i'|| alphabet == 'o'|| alphabet == 'u' || alphabet == 'A'|| alphabet == 'E'|| alphabet == 'I'|| alphabet == 'O'|| alphabet == 'U') {
    	System.out.println("Character is Vowel");
    }
	}
}
