package com.learning.String_Holcaz_Balaz.BruteForce;

public class BruteForceSearch {
	
	public static void main(String[] args) {
		String a= "This is test";
		
		String p="test";
		
		int search = search(a, p);
		System.out.println(search);
		System.out.println(a.substring(search));
	}
	
	public static int search(String text, String pattern) {
		
		int lengthOfText = text.length();
		int lengthOfPattern = pattern.length();
		
		// Consider all the letters of the text
		for(int i=0;i<=lengthOfText-lengthOfPattern;i++) {
			
			// This j is going to track the letters of the pattern
			int j;
			
			for(j=0;j<lengthOfPattern;j++) {
				if(text.charAt(i+j) != pattern.charAt(j)) {
					break;
				}
			}
			
			// If pattern exists
			if(j == lengthOfPattern) {
				return i;
			}
		}
		
		// If pattern does not exists		
		return -1;
	}

}
