package com.kn.practiceprogram;

public class ComparingDemo {
	public static void isComparing(int num1, int num2, int num3) {
		if(num1==num2 && num2==num3 && num3==num1 ) {
			System.out.println("All are Equal");
		}
		else if (num1>num2 && num2>num3) {
			System.out.println("Given Number is largest number");
		}
		else if (num1<num2 && num2<num3) {
			System.out.println("Given number is smallest number");
		}
	}

}
