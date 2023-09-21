package com.kn.selection;
import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		WeekDay number = new WeekDay();
		number.weekFindOut(num);
		scan.close();

	}

}
