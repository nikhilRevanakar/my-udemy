package com.learning.strings.QA;

public class SegmentsInString {

//	Given a string s, return the number of segments in the string.
//
//	A segment is defined to be a contiguous sequence of non-space characters.
	
//	Example 1:
//
//	Input: s = "Hello, my name is John"
//	Output: 5
//	Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
	
//	Example 2:
//
//	Input: s = "Hello"
//	Output: 1
	public static void main(String[] args) {
//		System.out.println((int)' ');
//		System.out.println(countSegments(", , , ,        a, eaefa"));
		System.out.println(countSegments("        "));
	}
	
	public static int countSegments(String s) {
		System.out.println(s.isEmpty());
		s = s.trim();
		char[] charArray = s.toCharArray();
		String[] ss = s.split(" ");
		int cnt= 0;
		System.out.println(s.trim());
        return ss.length;
    }

}
