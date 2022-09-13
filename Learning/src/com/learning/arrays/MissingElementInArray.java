package com.learning.arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		// Find the missing element within 1-10
		int[] arr = {1,2,3,4,5,6,8,9,10}; // 7 is missing
		missing(arr);
		

	}
	
	public static void missing(int[] arr) {
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i:arr) {
			sum1+=i;
		}
		
		// Formula to find the sum of number - n(n+1)/2 
		// 1..10  -> 10(10+1)/2
		// 1..200 -> 200(200+1)/2
		sum2 = 10*(10+1)/2;
		
		int diff = sum2-sum1;
		System.out.println(diff);
	}

}
