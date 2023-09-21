package com.kn.practiceprogram;

import java.util.Scanner;

public class Comparing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		System.out.println("Enter Third number");
		int num3 = scan.nextInt();
		ComparingDemo c1= new ComparingDemo();
		c1.isComparing(num1,num2,num3);
		scan.close();
	}

	


	

}
