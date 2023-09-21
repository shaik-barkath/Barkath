package com.kn.BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimalDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int num = scan.nextInt();
		BinaryToDecimal b1 = new BinaryToDecimal();
		System.out.println("Decimal of Binary number " + num + " is = " + b1.binaryconvert(num));
		scan.close();

	}

}
