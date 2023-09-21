package com.kn.LeapYear;

public class LeapYear {

	public void leapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Leap Year");
				} else {
					System.out.println("Not Leap Year");
				}
			} else {
				System.out.println("Leap Year");
			}
		} else {
			System.out.println("Not Leap Year");
		}
	}

}
