package com.learning.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	
//	Given two integer arrays nums1 and nums2, return an array of their intersection.
//	Each element in the result must be unique and you may return the result in any order.
//	Example 1:
//
//		Input: nums1 = [1,2,2,1], nums2 = [2,2]
//		Output: [2]
//	Example 2:
//
//		Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//		Output: [9,4]
//		Explanation: [4,9] is also accepted.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] greater = {1,2,2,1};
		int[] lesser = {2,2};
		intersection(greater, lesser);
	}
	
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        int[] greater = new int[0];
        int[] lesser = new int[0];
        
        List<Integer> res = new ArrayList<>();
        
        if(nums1.length > nums2.length) {
            greater = nums1;
            lesser = nums2;
        } else {
            lesser = nums1;
            greater = nums2;
        }
        
        for(int i=0;i<lesser.length;i++){
            
            for(int j=0;j<greater.length;j++){
                if(lesser[i] == greater[j] && !res.contains(lesser[i])) {
                    res.add(lesser[i]);
                }
            }
        }
        int[] result = new int[res.size()];
        
        for(int i=0;i<res.size();i++){
            result[i] = res.get(i);
        }
        
        return result;
        
    }

}
