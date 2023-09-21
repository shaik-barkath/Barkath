package com.kn.factor;

import java.util.Scanner;

public class FactorDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		Factor f1 = new Factor();
		f1.factor(num);
		scan.close();

	}

}
