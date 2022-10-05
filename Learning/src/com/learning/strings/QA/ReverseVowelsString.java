package com.learning.strings.QA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsString {

//	Given a string s, reverse only all the vowels in the string and return it.
//
//	The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
	
//	Example 1:
//
//		Input: s = "hello"
//		Output: "holle"
	
//	Example 2:
//
//		Input: s = "leetcode"
//		Output: "leotcede"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hEllo";
		char[] charArray = s.toCharArray();
		int l = 0;
		int r = charArray.length-1;
		List<Character> check = new ArrayList<>();
		check.add('a');
		check.add('e');
		check.add('i');
		check.add('o');
		check.add('u');
		check.add('A');
		check.add('E');
		check.add('I');
		check.add('O');
		check.add('U');
		
		while(l<r) {
			
			System.out.println(charArray[l] +" "+charArray[r]);
			if( (check.contains(charArray[l])) && 
					(check.contains(charArray[r]))) {
			char tmp = charArray[l];
			charArray[l] = charArray[r];
			charArray[r] = tmp;
			l++;
			r--;
			}
			if(!(check.contains(charArray[l]))) {
			l++;
			}
			if(!(check.contains(charArray[r]))) {
			r--;
			}
		}

		String builder = "";
		for(char e: charArray) {
		builder += e;
		}
		System.out.println(builder);
		
		
	}

}
