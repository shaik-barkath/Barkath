package com.kn.reversenumber;

import java.util.Scanner;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number= ");
		int num = scan.nextInt();
		ReverseNumber r1=new ReverseNumber();
		System.out.println("Reverse Number =");
		r1.isreverse(num);
		scan.close();
	}

}
