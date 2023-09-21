package com.kn.LeapYear;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year");
		int year=scan.nextInt();
		LeapYear l1=new LeapYear();
		l1.leapYear(year);
		scan.close();
	}

}
