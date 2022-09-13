package com.learning.arrays;

import java.util.Arrays;

public class ReverseArray90Degree {

	public static void main(String[] args) {
		
		// Reverse array 90 degree
		// Input.
		// 1 2 3
		// 4 5 6
		// 7 8 9
		//
		// Output 
		// 7 4 1
		// 8 5 2
		// 9 6 3
		// input = [[1,2,3],[4,5,6],[7,8,9]]
		// Output = [[7,4,1],[8,5,2],[9,6,3]]
		
		int[][] in = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int i=0;i<in.length;i++) {
			for(int j=0;j<in[i].length;j++) {
					System.out.print(in[i][j]+" ");
				}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("------Reverse--------");
		reverse(in);
		
	}
	
	public static void reverse(int[][] in) {
		// Input.
		//	 0 1 2
		//0	 1 2 3
		//1	 4 5 6
		//2	 7 8 9
		//
		// Output
		//   0 1 2
		//0	 7 4 1
		//1	 8 5 2
		//2	 9 6 3
		for(int i=0;i<in.length;i++) {
			
			for(int j=in.length-1;j>=0;j--) {
				
				System.out.print(in[j][i]+" ");
				}
			
			System.out.println();
		}
		
		System.out.println("---------New String------");
		
		int[][] op = new int[in.length][in.length];
		
		for(int i=0;i<in.length;i++) {
			int p = 0;
			for(int j=in.length-1;j>=0;j--) {
				op[i][p] = in[j][i];
				p++;
				}
		}
		
		System.out.println(Arrays.deepToString(op));
		
		
	}

}
