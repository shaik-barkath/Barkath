package com.kn.selection;
import java.util.Scanner;

public class Numbercheck {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
    int number = scan.nextInt();
    scan.close();
    if(number>0) {
    	System.out.println("Number is a positive ");
    }
    
    }

}
