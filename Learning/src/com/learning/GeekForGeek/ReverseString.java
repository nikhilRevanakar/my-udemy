package com.learning.GeekForGeek;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		rev(s);
		System.out.println(Arrays.toString(s));
	}
	
	public static void rev(char[] s) {
		int i = 0;
		int j= s.length-1;
		while(i<=j) {
			char tmp = s[i];
			s[i] = s[j];
			s[j] = tmp;
			i++;
			j--;
		}
	}

}
