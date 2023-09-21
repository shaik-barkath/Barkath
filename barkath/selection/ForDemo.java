package com.kn.selection;
import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		System.out.println("Enter the Range = ");
    for(int i=num;i>=1;i--) {
    	System.out.println(i);
    	scan.close();
    }
	}

}
