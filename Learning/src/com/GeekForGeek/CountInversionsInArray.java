package com.GeekForGeek;

public class CountInversionsInArray {
	
	//https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?page=2&curated[]=1&sortBy=submissions
	
//	Given an array of integers. Find the Inversion Count in the array. 
//
//	Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. 
//	If array is already sorted then the inversion count is 0. 
//	If an array is sorted in the reverse order then the inversion count is the maximum. 
//	Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
	
//	Example 1:
//
//		Input: N = 5, arr[] = {2, 4, 1, 3, 5}
//		Output: 3
//		Explanation: The sequence 2, 4, 1, 3, 5 
//		has three inversions (2, 1), (4, 1), (4, 3).
//	Example 2:
//
//		Input: N = 5
//		arr[] = {2, 3, 4, 5, 6}
//		Output: 0
//		Explanation: As the sequence is already 
//		sorted so there is no inversion count.
//	Example 3:
//
//		Input: N = 3, arr[] = {10, 10, 10}
//		Output: 0
//		Explanation: As all the elements of array 
//		are same, so there is no inversion count.
	
//	************ NOTE ****************
//	**********************************
//	Below Is not optimized Code -  Check second version of it
	
	public static void main(String[] args) {
		long arr[] = {2, 4, 1, 3, 5};
		long cnt = inversionCount(arr, arr.length);
		System.out.println(cnt);
	}
	
	 static long inversionCount(long arr[], long N)
	    {
	        // Your Code Here
	        int cnt = 0;
	        for(int i=0;i<N;i++) {
	            int test = cntNum(arr, i, i+1, 0);
	            cnt = cnt+ test;
	        }
	        return cnt;
	    }
	    
	    static int cntNum(long a[], int s, int n, int cnt) {
	        if(s==a.length-1) {
	            return cnt;
	        } 
	        if(n==a.length) {
	            return cnt;
	        }
	         
	        if(a[s]>a[n]) {
	            cnt= cnt+1;
	        }
	        return cntNum(a, s, n+1, cnt);
	        
	    }

}
