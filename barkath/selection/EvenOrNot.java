package com.kn.selection;
import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = scan.nextInt();
    scan.close();
    if (number%2==0) {
    	System.out.println("Given number is EVEN");
    }
    else {
    	System.out.println("Not a Even Number");
    }
     
	}

}
