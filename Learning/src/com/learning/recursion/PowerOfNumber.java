package com.learning.recursion;

public class PowerOfNumber {

	public static void main(String[] args) {
		/* 
		 * How to calculate the power of number using recursion??
		 * 
		 * 2^4 = 2*2*2*2
		 * 
		 * 
		 */
		System.out.println(power(2,4));
	}
	
	
	public static int power(int base, int exp) {
		if(exp==1) {
			return base;
		}
		return base * power(base, exp-1);
	}

}
