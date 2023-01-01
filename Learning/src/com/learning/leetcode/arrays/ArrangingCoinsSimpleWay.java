package com.learning.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrangingCoinsSimpleWay {

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
		int res = arrangeCoins(8);
		System.out.println(res);
	}
	public static int arrangeCoins(int n) {
		        
		int count = 0;
        while (n > 0){
            count++;
            n = n - count;
        }
        return n < 0 ? count-1 : count;
    }

}
