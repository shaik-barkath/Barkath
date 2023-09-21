package com.kn.selection;
import java.util.Scanner;

public class RainbowUsingSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a color");

		char rainbow1 = scan.next().charAt(0);
		RainbowUsingSwitchApp r1 = new RainbowUsingSwitchApp();
		r1.findRainbowColor(rainbow1);
		scan.close();
	}

}
