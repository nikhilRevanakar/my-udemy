package com.learning.leetcode;

import java.util.stream.Collectors;

public class SplitArrayLargestSum {


//	https://leetcode.com/problems/split-array-largest-sum/description/
//	Given an integer array nums and an integer k,
//	split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//
//	Return the minimized largest sum of the split.
//
//	A subarray is a contiguous part of the array.
//	Example 1:
//
//	Input: nums = [7,2,5,10,8], k = 2
//	Output: 18
//	Explanation: There are four ways to split nums into two subarrays.
//	The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
	
//	Example 2:
//
//	Input: nums = [1,2,3,4,5], k = 2
//	Output: 9
//	Explanation: There are four ways to split nums into two subarrays.
//	The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
	public static void main(String[] args) {
		
//		int[] arr = {7,2,5,10,18};
		int[] arr = {3,5,1,4};
		int k =4;
		
		System.out.println(splitArray(arr, k));
	}
	
	public static int splitArray(int[] arr, int k) {
		int l = findMax(arr);
		int r = findSum(arr);
		int answer = 0;
		while(l<=r) {
			int mid = (l+r) / 2;
			if(canSplit(mid,arr, k)) {
				answer = mid;
				r = mid-1;
			} else {
				l = mid+1;
			}
			
		}
		
		return answer;
	}

	private static boolean canSplit(int mid, int[] arr, int k) {
		int subArray = 0;
		int curSum = 0;
		for(Integer num :arr) {
			if (num > mid)
                return false;
			curSum += num;
			if(curSum>mid) {
				subArray++;
				curSum = num;
			}
		}
		
		return subArray+1 <= k;
	}

	public static int findMax(int[] arr) {
		int max = 0;
		for(int i=0;i<arr.length-1;i++) {
			max = arr[i]>arr[i+1] ? arr[i] : arr[i+1];
		}
		return max;
	}

	public static int findSum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
}
