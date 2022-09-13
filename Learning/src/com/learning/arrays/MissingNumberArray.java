package com.learning.arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5,6,8,9,10};
		
		int num = ar.length;
		int sum = 10*(10+1)/2;
		int sumAr = 0;
		for(int i:ar) {
			sumAr+=i;
		}
		
		
		int diff = sum-sumAr;
		
		System.out.println("Sum "+sum);
		System.out.println("SumAr "+sumAr);
		System.out.println(diff);
	}

}
