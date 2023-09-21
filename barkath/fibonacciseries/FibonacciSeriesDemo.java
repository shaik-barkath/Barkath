package com.kn.fibonacciseries;

import java.util.Scanner;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number =");
		int number = scan.nextInt();
		FibonacciSeries f1 = new FibonacciSeries();
		f1.fibonacci(number);
		scan.close();

	}

}
