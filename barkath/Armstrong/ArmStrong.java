package com.kn.Armstrong;

public class ArmStrong {

	public void armStrong(int num) {
		int digit = 0, sum = 0;
		int temp = num;
		while (num > 0) {
			digit = num % 10;
			digit = digit * digit * digit;
			sum = sum + digit;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not ArmStrong Number");
		}

	}

}
