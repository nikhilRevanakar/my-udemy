package com.learning.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbersDisappearedInArrays {

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
		int[] nums1 = {4,3,2,7,8,2,3,1};
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums1);
		System.out.println(findDisappearedNumbers);
	}
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        
    	int max = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
       
        List<Integer> re = new ArrayList<>();
        for(int i=1;i<=max;i++){
            if(!set.contains(i)) {
                re.add(i);
            }
        }
        
        return re;
        
    }

}
