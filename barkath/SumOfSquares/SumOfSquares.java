package com.kn.SumOfSquares;

public class SumOfSquares {

	public void sumOfSquares(int num) {
		int i = 0, sum = 0;
		while (i <= num) {
			sum = sum + i * i;
			i++;
		}
		System.out.println("Sum of Squares = " + sum);

	}

}
