package com.learning.strings.QA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IndexOfFirstOccurenceInString2 {
	
	
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
		
		String needle ="sat";
		
		String haystack ="sadbutsad";
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<needle.length();i++) {
			map.put(needle.charAt(i), 0);			
		}
		
		System.out.println(map);
		
		int t =0;
		for(int i=0;i<haystack.length();i++) {
			if(map.containsKey(haystack.charAt(i)) && map.get(haystack.charAt(i))==0) {
				map.replace(haystack.charAt(i), 1);
				t++;
				if(t==needle.length()) {
					System.out.println(i-t+1);
					break;
				}
			} else {
				t=0;
				map.forEach((a,b) -> map.put(a, 0));
				
			}
			
		}
		
		
	}

}
