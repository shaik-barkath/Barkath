package com.kn.selection;
import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a color = ");
		RainbowApp rainbow = new RainbowApp();
		char letter = scan.next().charAt(0);
		rainbow.checkcolor(letter);
		scan.close();
	}


}
