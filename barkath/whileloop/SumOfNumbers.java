package com.kn.whileloop;

public class SumOfNumbers {

	public void sumOfNNumbers(int number) {
		
		int sum = 0;
		while (number >= 1) {
			sum += number;
			--number;
		}
		System.out.println("sum = " + sum);
	}
}
