package com.learning.arrays;

public class CheckTwoArraySame02 {

	public static void main(String[] args) {
		int[] arr1 = {22,33,44,55};
		int[] arr2 = {55,44,33,22};
		
		System.out.println(isSame(arr1, arr2));
	}
	
	public static boolean isSame(int[] arr1, int[] arr2) {
		int sum1 = 0;
		int sum2 = 0;
		int mul1 = 1;
		int mul2 = 1;
		
		for(int i=0;i<arr1.length;i++) {
			
			sum1 += arr1[i];
			sum2 += arr2[i];
			mul1 *= arr1[i];
			mul2 *= arr2[i];
		}
		
		if(sum1==sum2 && mul1==mul2) {
			return true;
		}
		return false;
	}

}
