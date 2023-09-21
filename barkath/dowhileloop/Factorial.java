package com.kn.dowhileloop;

public class Factorial {
	public void factorial(int number) {
		int i = 1, factorial = 1;
		do {
			factorial = factorial * i;
			i++;
		} while (i <= number);
		System.out.println(factorial);
	}

}