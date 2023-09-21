package com.kn.SumOfSquares;

import java.util.Scanner;

public class SumOfSquaresDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		SumOfSquares s1=new SumOfSquares();
		s1.sumOfSquares(num);
		scan.close();
	}

}
