package com.learning.recursion;

public class GSD {

	public static void main(String[] args) {
		/*
		 * How to find the Greatest Common Divisor of two numbers using recursion?
		 * 
		 * GCD is the largest positive number that divides the numbers without a reminder
		 * 
		 * Example: 
		 * 
		 * gcd(8,12) = 4
		 * 
		 * 8 = 2*2*2
		 * 12 = 2*2*3
		 * 
		 * Using Euclidean Algorithm
		 * 
		 * gcd(48,18) = 6 [this is last postive reaminder, as we are returning 'a' value if 'b' value is 0 ] 
		 * 
		 * step 1: 48/18 = 2 remainder 12
		 * step 2: 18/12 = 1 remiander 6   
		 * step 3: 12/6 = 2 remainder 0
		 * 
		 * gcd(a,0) = a
		 * gcd(a,b) = gcd(b, a mod b) 
		 */
		
//		System.out.println(gcd(8,12));  4
		System.out.println(gcd(48,18)); // 6
		
	}
	
	public static int gcd(int a, int b) {
		// when b=0 return a
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}

}
