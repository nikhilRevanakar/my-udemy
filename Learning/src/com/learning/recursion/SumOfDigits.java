package com.learning.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		/*
		 * How to find the sum of digits of Positive integer number using recursion??
		 * 
		 * given n number provide the sum of digits
		 * that is 
		 * n = 43 -----> output = 4+3 =7 
		 * n = 10 -----> outout = 1+0 = 1
		 * n = 112 -----> output = 112/10 = 11 and remainder = 2 
		 * 		   ----->Again 11 is 2 digit number so 11/10 = 1 remainder = 1
		 * 			----> 1 + 1 + 2 =4 
		 * 
		 * f(n) = n%10 + f(n/10)
		 */		 
		
		
		System.out.println(sumOfDigits(112));

	}
	
	public static int sumOfDigits(int n) {		
		// Only Positive integer allowed
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 0;
		}
		int remainder = (n%10) + sumOfDigits(n/10);
		
		return remainder;
	}

}
