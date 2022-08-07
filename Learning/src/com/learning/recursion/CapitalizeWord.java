package com.learning.recursion;

public class CapitalizeWord {

	/*
	 * Implement a function that capitalizes each word in string
	 * 
	 * Ip: i love you Ot: I Love You
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "i love you";
		System.out.println(capi(a));
		}

	
	  private static String capi(String a) { // TODO Auto-generated method stub
	  
	  String[] split = a.split(" ");
	  
	  int len = split.length; 
	  
	  if(len==1) {
		  return String.valueOf(split[0].charAt(0)).toUpperCase()+split[0].substring(1);
	  }
	  
	  return String.valueOf(split[0].charAt(0)).toUpperCase()+split[0].substring(1) + " "+  capi(a.substring(a.indexOf(split[1]), a.length()));
	 
	  }
	 
}
