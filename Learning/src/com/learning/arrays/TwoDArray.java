package com.learning.arrays;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		// First approach
		System.out.println("-----------First approach--------------");
		int[][] arr = new int[2][2];
		
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("---------------------------------------");
		System.out.println("-----------Second approach--------------");
		
		int[][] arr2 = {{1,2,3},{77,77,44}};
		System.out.println(Arrays.deepToString(arr2));
		
		
	}

}
