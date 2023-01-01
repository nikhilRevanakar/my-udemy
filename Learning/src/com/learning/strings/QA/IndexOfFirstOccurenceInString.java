package com.learning.strings.QA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IndexOfFirstOccurenceInString {
	
	
	public static void main(String[] args) {
		
		String needle ="sad";
		
		String haystack ="sabbutsad";
		
		
		Set<Character> set = new HashSet<>();
		int l=0;
		int r=0;
		
		while(r<haystack.length()) {
			if(haystack.charAt(r)==needle.charAt(l)) {	
				if(l==needle.length()-1) {
					System.out.println(r-l);
					break;
				}
				l++;
				r++;
				
			}
			else {
				l=0;
				r++;
			}
		}
		
		
	}

}
