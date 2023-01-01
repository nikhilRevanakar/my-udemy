package com.learning.strings.QA;

import java.util.Arrays;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		
		String word = "mom is mom";
		char[] a = word.toCharArray();
		char[] b = new char[word.length()];
		int j=0;
		for(int i=word.length()-1;i>=0;i--) {
			b[j] = word.charAt(i);
			j++;
		}
		
		System.out.println(Arrays.equals(a, b));
		
	}
	
}
