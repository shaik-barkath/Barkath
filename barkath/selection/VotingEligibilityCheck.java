package com.kn.selection;
import java.util.Scanner;

public class VotingEligibilityCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Take input from end user
		System.out.println("Enter your Age = ");
		// Initializing a Variable
		int age = scan.nextInt();
		// Calling a method
		checkEligibleForVotingOrNot(age);
		scan.close();
	}

	public static void checkEligibleForVotingOrNot(int age) {
		// checking the Eligibility
		if (age >= 18) {
			// printing a Success message
			System.out.println("Congratulation! You are Eligible for Voting");
			// printing a Failure message
		} else {
			System.out.println("Chhotu! Go to School,Study well");
		}

	}

}
