package com.kn.selection;
import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Marks = ");
		int marks = scan.nextInt();
		checkGrade(marks);
		scan.close();
	}

	public static void checkGrade(int marks) {
		if (marks > 90) {
			System.out.println("A Grade");
		} else if (75 < marks && marks <= 90) {
			System.out.println("B Grade");
		} else if (60 < marks && marks <= 75) {
			System.out.println("C Grade");
		} else if (45 < marks && marks <= 60) {
			System.out.println("D Grade");
		} else if (35 < marks && marks <= 45) {
			System.out.println("A Grade");
		} else {
			System.out.println("Try Next Semester");
		}
	}

}
