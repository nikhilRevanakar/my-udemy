package com.learning.arrays;

public class SumOfDiagnalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse array 90 degree
		// Input.
		//	 0 1 2
		//0	 1 2 3
		//1	 4 5 6
		//2	 7 8 9
		int[][] ar = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int sum = 0;
		
		for(int i=0;i<ar.length;i++) {
			
			sum+=ar[i][i];
			
		}
		System.out.println(sum);

	}

}
