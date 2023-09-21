package com.kn.whileloop;

import java.util.Scanner;

public class SumOfNumbersUsingWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int number = scan.nextInt();

		int sum = 0;
		while (number >= 1) {
			sum += number;
			--number;
		}
		System.out.println("sum = " + sum);
		scan.close();
	}
}
