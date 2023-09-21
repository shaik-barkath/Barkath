package com.kn.GCD;

import java.util.Scanner;

public class GcdDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number =");
		int num1 = scan.nextInt();
		System.out.println("Enter another number =");
		int num2 = scan.nextInt();
		Gcd g1 = new Gcd();
		g1.gcd(num1, num2);
		scan.close();
	}

}
