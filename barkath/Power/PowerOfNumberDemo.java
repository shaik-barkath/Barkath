package com.kn.Power;

import java.util.Scanner;

public class PowerOfNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base");
		int base=scan.nextInt();
		System.out.println("Enter Exponant");
		int exponant=scan.nextInt();
		PowerOfNumber p1=new PowerOfNumber();
		p1.powerOfNumber(base,exponant);
		scan.close();
		}

}
