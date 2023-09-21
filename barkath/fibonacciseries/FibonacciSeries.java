package com.kn.fibonacciseries;

public class FibonacciSeries {
	public void fibonacci(int number) {
		int first = 0, second = 1, next = 0;
		System.out.print(+first + " " + second);
		for (int i = 3; i <= number; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(" " + next);
		}
	}
}