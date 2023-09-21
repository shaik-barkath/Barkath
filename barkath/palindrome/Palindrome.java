package com.kn.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		PalindromeDemo p1 = new PalindromeDemo();
		p1.palindrome(num);
		scan.close();
	}

	

}