package com.learning.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {

//	Given a string s, find the length of the longest 
//	substring without repeating characters.
//	Example 1:
//
//		Input: s = "abcabcbb"
//		Output: 3
//		Explanation: The answer is "abc", with the length of 3.
//	Example 2:
//
//		Input: s = "bbbbb"
//		Output: 1
//		Explanation: The answer is "b", with the length of 1.
//	Example 3:
//
//		Input: s = "pwwkew"
//		Output: 3
//		Explanation: The answer is "wke", with the length of 3.
//		Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLength("abcabcbb"));
	}
	
	public static int getLength(String word) {
		Set<Character> set = new HashSet<>();
		int l=0;
		int res = 0;
		
		for(int i=0;i<word.length();i++) {
			while(set.contains(word.charAt(i))) {
				set.remove(word.charAt(l));
				l++;
			}
			set.add(word.charAt(i));
			res = Math.max(res, i-l+1); 
		}
		
		return res;
	}

}
