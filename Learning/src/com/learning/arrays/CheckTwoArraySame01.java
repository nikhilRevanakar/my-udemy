package com.learning.arrays;

public class CheckTwoArraySame01 {

	public static void main(String[] args) {
		int[] arr1 = {22,33,44,55};
		int[] arr2 = {55,44,33,22};
		
		System.out.println(isSame(arr1, arr2));
	}
	
	public static boolean isSame(int[] arr1, int[] arr2) {
		
		for(int i=0;i<arr1.length;i++) {
			boolean present = false;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					present = true;
				}
			}
			
			if(!present) {
				return false;
			}
		}
		
		return true;
	}

}
