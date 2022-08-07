package com.learning.recursion;

public class FirstUppercase {

	/*
	 * Given a string find its first upper case 
	 * 
	 * Input = appmillerS
	 * Output = S
	 * 
	 */
	public static void main(String[] args) {
		String a = "appmillerS";
		System.out.println(firstUpper(a));
	}

	private static char firstUpper(String a) {
		
		int len = a.length();
		
		if(Character.isUpperCase(a.charAt(len-1))) {
			return a.charAt(len-1);
		}
		
		return firstUpper(a.substring(0, len-1));
	}

}
