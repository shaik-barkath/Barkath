package com.kn.selection;
import java.util.Scanner;

public class EvenOrOddCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Take input for end user
		System.out.println("Enter a number = ");
		// initializing a variable
		int number = scan.nextInt();
		// Calling a method
		evenOrOddChecking(number);
		scan.close();
	}

	public static void evenOrOddChecking(int number) {
		if (number % 2 == 0) {
			// printing a Success message
			System.out.println("The given number " + number + " is Even");
		} else {
			// printing a Failure message
			System.out.println("The given number " + number + " is Odd");
		}
	}

}
