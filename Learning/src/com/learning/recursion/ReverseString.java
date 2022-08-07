package com.learning.recursion;

public class ReverseString {

	/*
	 * Write a recusrion function which accepts a string and returns a new string in reverse
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(revers("java"));
	}
	
	public static String revers(String str) {
		// java --> a v a j
		// a v a j
		// len-1, len-2, len-3
		
		if(str.length()==0) {
			return "";
		}
		
		int leng = str.length();
		
		return str.charAt(leng-1) + revers(str.substring(0, leng-1));
	}

}
