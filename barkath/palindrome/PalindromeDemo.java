package com.kn.palindrome;

public class PalindromeDemo {
	public void palindrome(int num) {
		int digit = 0, sum = 0;
		int temp = num;
		while (num > 0) {
			digit = num % 10;
			sum = sum * 10 + digit;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not a palindrome");
		}

	}

}
