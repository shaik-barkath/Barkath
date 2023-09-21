package com.kn.whileloop;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {

		System.out.println("enter a number = ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		SumOfNumbers numbersum = new SumOfNumbers();
		numbersum.sumOfNNumbers(number);
		scan.close();
	}

}
