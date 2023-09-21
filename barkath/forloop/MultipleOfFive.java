package com.kn.forloop;

import java.util.Scanner;

public class MultipleOfFive {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number = ");
    int multiple = scan.nextInt();
    for(int i=1;i<=10;i++) {
    System.out.println(multiple + " * "+i+" = "+(multiple*i));
    scan.close();
    }
	}

}
