package com.learning.strings.QA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class FirstUniqueCharacterInString02 {

//	Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
	
//	Example 1:
//
//		Input: s = "leetcode"
//		Output: 0
//	Example 2	
//
//		Input: s = "loveleetcode"
//		Output: 2
//	Example 3:
//
//		Input: s = "aabb"
//		Output: -1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer check = check("loveleetcode");
		System.out.println(check);
	}
	
	public static Integer check(String s) {
        
		// ASCII Character
		// a - 97  A - 65
		// b - 98  B - 66
		// build char count bucket : <charIndex, count>
		int[] charIndex = new int[26];
		
		
		for(int i=0;i<s.length();i++) {
			int index = s.charAt(i) - 'a';
			charIndex[index]++;
		}
		
		for(int i=0;i<s.length();i++) {
			int index = s.charAt(i) - 'a';
			if(charIndex[index] == 1) {
				return i;
			}
		}
		
		return null;
	}

}
