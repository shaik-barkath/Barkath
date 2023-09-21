package com.kn.whileloop;

import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Table m1 = new Table();
		m1.multipleTable(num);
		scan.close();
	}

}
