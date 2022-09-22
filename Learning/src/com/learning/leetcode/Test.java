package com.learning.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a = "aaabbbcc";
		
		String a = "aabbbabaabbcc";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length();i++) {
			char b = a.charAt(i);
			if(map.containsKey(b)) {
				int cnt = map.get(b);
				cnt++;
				map.replace(b, cnt);
			} else {
				map.put(b, 1);
			}
		}
		
		System.out.println(map);
	     
	}

}
