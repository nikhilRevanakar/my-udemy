package com.learning.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionPart2 {

	
	/*
	 * Given two integer arrays nums1 and nums2, return an array of their
	 * intersection. Each element in the result must appear as many times as it
	 * shows in both arrays and you may return the result in any order.
	 */
	/*
	 * Example 1:
	 * 
	 * Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2]
	 * 
	 * Example 2:
	 * 
	 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9] Explanation: [9,4]
	 * is also accepted.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] greater = {1,2,2,1};
		int[] lesser = {2,2};
		intersect(greater, lesser);
	}
	
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        
        int[] smaller = null;
        int[] greater =  null;
        
        if(nums1.length < nums2.length) {
            smaller = nums1;
            greater = nums2;
        } 
        if(nums1.length > nums2.length) {
            
        	greater = nums1;
            smaller = nums2;
        } 
        if(nums1.length == nums2.length){
            
        	smaller=nums1;
        	greater=nums2;

        }
        
        List<Integer> lis = new ArrayList<>();
        
        for(int i=0;i<smaller.length;i++) {
            for(int j=0;j<greater.length;j++) {
                if(smaller[i]==greater[j]) {
                    greater[j] = Integer.MIN_VALUE;
                    lis.add(smaller[i]);
                     break;
                }
               
            }
        }
        
        int[] result = new int[lis.size()];
        for(int i=0;i<lis.size();i++) {
            result[i] = lis.get(i);
        }
        
        return result;
    }

}
