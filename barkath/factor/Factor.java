package com.kn.factor;

public class Factor {

	public void factor(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i + " ");
			}
		}
	}

}
