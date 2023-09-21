package com.kn.nested;

import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int number = scan.nextInt();
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			scan.close();

		}
	}

}
