package com.learning.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

//	Given an integer numRows, return the first numRows of Pascal's triangle.
//
//	In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//			1
//		   1 1
//		  1 2 1
//		1  3 3 1
//	  1  4	6  4  1	
//	Input: numRows = 5
//	Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
	public static void main(String[] args) {
		
		check(5);
	}
	
	// Solution:
	// Digit is formed by adding left and right top elements
	// For ex. 3rd row 2 element is formed by adding 2nd row 1 and 1
//	    1
//	   1 1
//	  1 2 1
//	1  3 3 1
//1  4	6  4  1	
	// Assume we have 0 at empty places. We can re-write the triangle like below
//0 0  1 0 0
//0 0 1 1  0
//0  1 2 1 0
//0 1 3 3  1 0
//1  4	6  4  1		
	public static  void check(int numOfRows) {
		List<List<Integer>> l = new ArrayList<>();
		List<Integer> a =  new ArrayList<>();
		a.add(1);
		l.add(a);
		
		
		for(int i=1;i<numOfRows;i++) {
			List<Integer> last = l.get(l.size()-1);
			List<Integer> newList =  new ArrayList<>();
			newList.add(0);
			newList.addAll(last);
			newList.add(0);
			List<Integer> updatedList =  new ArrayList<>();
			
			for(int k=0;k<newList.size()-1;k++) {
				int d =newList.get(k)+newList.get(k+1);
				updatedList.add(d);
			}
			l.add(updatedList);
		}
		
		print(l);
		
	}
	
	public static void print(List<List<Integer>> l) {
		for(List<Integer> f:l) {
			System.out.println(f);
		}
		
	}

}
