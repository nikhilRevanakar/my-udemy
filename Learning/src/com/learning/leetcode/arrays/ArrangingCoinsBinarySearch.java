package com.learning.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrangingCoinsBinarySearch {

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
		int res = arrangeCoins(5);
		System.out.println(res);
	}
	public static int arrangeCoins(int n) {
		
		int l=1;
		int r=n;
		int res = 0;
		
		while(l<=r) {
			int mid = (l+r)/2;
			int cal = (int)(((double)mid/2) * (mid+1));
			if(cal > n) {
				r = mid-1;
			} else {
				l = mid+1;
				res = Math.max(res, mid);
			}
		}
		
		
        return res ;
    }

}
