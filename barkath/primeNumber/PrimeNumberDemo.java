package com.kn.primeNumber;

import java.util.Scanner;

public class PrimeNumberDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number =");
		int num = scan.nextInt();
		PrimeNumber p1 = new PrimeNumber();
		System.out.println(p1.isPrime(num));
		scan.close();
		
	}


}
