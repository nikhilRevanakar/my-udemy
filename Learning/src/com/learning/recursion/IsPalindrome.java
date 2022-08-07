package com.learning.recursion;

public class IsPalindrome {

	/*
	 *Write a recursive fucntion called isPalindrome whcih returns TRUE if the 
	 *string passed to it is a palindrome else false
	 *
	 *  tacocat -> TRUE
	 *  foobar -> False
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "foobar";
		
		System.out.println(isPalindrome(a));

	}

	private static boolean isPalindrome(String a) {
		// TODO Auto-generated method stub
		return a.equals(reverse(a));
	}

	private static String reverse(String a) {
		// java 
		// a v a j
		// len-1, len-2, len-3
		if(a.length()==0) {
			return "";
		}
		int leng = a.length();
		
		return a.charAt(leng-1) + reverse(a.substring(0, leng-1));
	}
	
	

}
