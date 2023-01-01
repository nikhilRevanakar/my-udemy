package com.learning.strings.QA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedSubstringPattern {
	
	// w   = a b c a b c
	// Len = 6
	// Break into 2 = 6/2 = 3
	// Reps = 6/3 = 2
	public static void main(String[] args) {
		
		String w = "abcabcabcab";
		
		System.out.println(check(w));
		
	}
	
	public static boolean check(String w) {
		int len = w.length();
		Map<String, String> m = new HashMap<>();
		m.containsValue(m);
		
		for(int i=len/2;i>=1;i--) {
			if(len%i==0) {
				int num_reps = len/i;
				String substring  = w.substring(0,i);
				System.out.println("Substring:"+substring);
				StringBuilder sb= new StringBuilder();
				for(int j=0;j<num_reps;j++) {
					sb.append(substring);
				}
				if(sb.toString().equals(w)) return true;
			}
		}
		return false;
	}
	
	

}
