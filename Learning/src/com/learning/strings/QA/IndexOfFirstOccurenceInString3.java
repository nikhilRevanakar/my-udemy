package com.learning.strings.QA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IndexOfFirstOccurenceInString3 {
	
	
	//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
//	or -1 if needle is not part of haystack.
	
//	Example 1:
//
//		Input: haystack = "sadbutsad", needle = "sad"
//		Output: 0
//		Explanation: "sad" occurs at index 0 and 6.
//		The first occurrence is at index 0, so we return 0.
//	Example 2:
//
//		Input: haystack = "leetcode", needle = "leeto"
//		Output: -1
//		Explanation: "leeto" did not occur in "leetcode", so we return -1.
	public static void main(String[] args) {
		
		String needle ="sad";
		
		String haystack ="saybutsad";
		
		int l=0;
		for(int i=0;i<=haystack.length()-needle.length();i++) {
			if(haystack.substring(i, i+needle.length()).equals(needle)) {
				System.out.println(i);
			}
		}
		
	}
	

}
