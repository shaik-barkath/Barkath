package com.kn.BinaryToDecimal;

public class BinaryToDecimal {

	public int binaryconvert(int num) {
		int sum=0,digit=0,e=0;
		while(num>0) {
			digit = num%10;
			sum=sum+(int)Math.pow(2,e)*digit;
			num=num/10;
			e++;
		}
		return sum;
	}
}
