package com.learning.leetcode.arrays;

public class ArrangingCoins {

	/*
	 * You have n coins and you want to build a staircase with these coins. The
	 * staircase consists of k rows where the ith row has exactly i coins. The last
	 * row of the staircase may be incomplete. Given the integer n, return the
	 * number of complete rows of the staircase you will build.
	 */
	
//	Example 1:
//		X
//		X X
//		X X _
//		
//		Input: n = 5
//		Output: 2
//		Explanation: Because the 3rd row is incomplete, we return 2.

//	Example 2:
//	X
//	X X
//	X X X
//	X X _ _
	
//	Input: n = 8
//	Output: 3
//	Explanation: Because the 4th row is incomplete, we return 3.


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = arrangeCoins(1804289383);
		System.out.println(res);
	}
	public static int arrangeCoins(int n) {
        
        int counter = 0;
        boolean com = false;
        int res = 0;
        for(int i=0;i<n;i++){
        	if(counter < n) {
	        	for(int j=0;j<i+1;j++) {
	        		if(counter <n) {
		        		System.out.print("X");
		        		counter++;
	        		} else {
	        			com = true;
	        			break;
	        		}
	        	}
	        	System.out.println();
	        	
	        	if(!com) {
	        	res++;
	        	}
        	}
        }
        
        
        return res;
    }

}
