package com.learning.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbersDisappearedInArraysSimpleWay {

	/*
	 * Given an array nums of n integers where nums[i] is in the range [1, n],
	 * return an array of all the integers in the range [1, n] that do not appear in
	 * nums.
	 */
	
	
	/*
	 * Example 1:
	 * 
	 * Input: nums = [4,3,2,7,8,2,3,1] Output: [5,6]
	 */

	/*
	 * Example 2:
	 * 
	 * Input: nums = [1,1] Output: [2]
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums1 = {4,3,2,7,8,2,3,1};
//		int[] nums1 = {1,2,2,3,3,4,7,8};
		int[] nums1 = {1,4,4,4};
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums1);
//		System.out.println(findDisappearedNumbers);
	}
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        
//    	int[] nums1 = {4,3,2,7,8,2,3,1};
    	
        List<Integer> re = new ArrayList<>();
        
        int size = nums.length;
        
        int r = 0;
        
        for(int i=1;i<=size;i++) {
        	r = nums[i-1];
        		
        		nums[Math.abs(r)-1] = -1 * Math.abs(r);
        	 
        }
        
        List<Integer> reTest = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>0) {
        		reTest.add(i+1);
        	}
        	System.out.println(nums[i]);
        }
        
        System.out.println(reTest);
        
        return re;
        
    }

}
