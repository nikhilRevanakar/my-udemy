package com.learning.strings.QA;

import java.util.Arrays;

public class ReverseString02 {

//	Write a function that reverses a string. 
//	The input string is given as an array of characters s.
//
//	You must do this by modifying the input array in-place with O(1) extra memory.
//	Input: s = ["h","e","l","l","o"]
//	Output: ["o","l","l","e","h"]
	
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		
		// Solution: Make use of two pointers Left and Right and swap the elements
		// till Left pointer less than right 
		// ["h","e","l","l","o"]
		//   L				 R
		// ["o","e","l","l","h"]
		//       L		 R
		// ["o","l","l","e","h"]
		//           LR
						
		int l = 0;
		int r = s.length-1;
		
		reverseString(l,r, s);

	}
	
	public static void reverseString(int l, int r, char[] s) {
		
		if(l>=r) {                  
		     return;
        }
        char tmp = s[l]; // tmp = e
			s[l] = s[r]; // j = h
			s[r] = tmp; // i =
			
		reverseString(l+1, r-1, s);
    }

}
