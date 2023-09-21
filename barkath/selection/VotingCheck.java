package com.kn.selection;
import java.util.Scanner;

public class VotingCheck {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your Age");
    int age = scan.nextInt();
    scan.close();
    
    if (age>=18) {
    	System.out.println("You are Eligible to Vote");
    }
	}

}
