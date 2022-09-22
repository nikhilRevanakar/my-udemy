package com.learning.dynamicProgramming.QA;

public class ClimbingStairs {
	
	
	/*
	 * You are climbing a staircase. It takes n steps to reach the top.
	 * 
	 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
	 * you climb to the top?
	 */
	
//	Example 1:
//
//		Input: n = 2
//		Output: 2
//		Explanation: There are two ways to climb to the top.
//		1. 1 step + 1 step
//		2. 2 steps
	
//	Example 2:
//
//		Input: n = 3
//		Output: 3
//		Explanation: There are three ways to climb to the top.
//		1. 1 step + 1 step + 1 step
//		2. 1 step + 2 steps
//		3. 2 steps + 1 step
	public static void main(String[] args) {
	
		int climb = climb(5);
		System.out.println(climb);
		
	}
	
	public static int climb(int n) {
//		Detailed Video Explanation : https://www.youtube.com/watch?v=Y0lT9Fck7qI
	
//		Steps: 0 | 1 | 2 | 3 | 4 | 5
//		Ways:  8 | 5 | 3 | 2 | 1 | 1
//							  one Two
//		Output = 8
		int one = 1;
		int two = 1;
		int tmp = 0;
		for(int i=0;i<n-1;i++) {
			tmp = one;
			one = one + two;
			two = tmp;
		}
		
		return one;
	}

}
