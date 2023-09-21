package com.kn.Power;

public class PowerOfNumber {

	public void powerOfNumber(int base, int exponant) {
		int temp=1;
		for(int i=1;i<=exponant;i++) {
			temp=temp*base;
		}
		System.out.println("power of number is = " +temp);
	}

}
