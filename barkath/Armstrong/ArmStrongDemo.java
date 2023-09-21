package com.kn.Armstrong;

import java.util.Scanner;

public class ArmStrongDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		ArmStrong a1 = new ArmStrong();
		a1.armStrong(num);
		scan.close();
	}

}
