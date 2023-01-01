package com.learning.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayPairSumDivisibility {

//https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1
	
//	Given an array of integers and a number k, write a function 
//	that returns true if given array can be divided into pairs such 
//	that sum of every pair is divisible by k.
	
//	Input : arr = [9, 5, 7, 3], k = 6
//	Output: True
//	Explanation: {(9, 3), (5, 7)} is a 
//	possible solution. 9 + 3 = 12 is divisible
//	by 6 and 7 + 5 = 12 is also divisible by 6.
	
//	Input : arr = [2, 4, 1, 3], k = 4
//	Output: False
//	Explanation: There is no possible solution.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 5, 7, 3};
		int k = 6;
		System.out.println(canPair(arr, k));
	}
	
	public static boolean canPair(int[] nums, int k) {
		int[] vis = new int[nums.length];
		Arrays.fill(vis, -1);
        // Code here
		int cnt = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if((nums[i]+nums[j])%k==0 && vis[i] == -1 && vis[j] == -1) {
					cnt++;
					
					vis[i] = 1;
					vis[j] = 1;
					
				}
			}
		}
		System.out.println(cnt);
		
		if(cnt == nums.length/2) {
			return true;
		}
		
		return false;
    }

}
