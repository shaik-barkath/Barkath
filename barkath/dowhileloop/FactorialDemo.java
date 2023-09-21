package com.kn.dowhileloop;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int number = scan.nextInt();
		Factorial f1 = new Factorial();
		f1.factorial(number);
		scan.close();
	}

}
