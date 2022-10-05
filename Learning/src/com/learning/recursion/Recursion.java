package com.learning.recursion;


public class Recursion {

	public static void main(String[] args) {
		// factorial
		// 4*3*2*1
		int r = factorial(4);
		System.out.println(r);
		
		//Fibonacci
		// 0,1,1,2,3,5,8..
		// Example
		// 5 = 3+2 f(n) = f(n-1) + f(n-2)
		int d = fibonacci(4);
		System.out.println(d);
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return n;
		}
		return n * factorial(n-1);
	}
	
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
