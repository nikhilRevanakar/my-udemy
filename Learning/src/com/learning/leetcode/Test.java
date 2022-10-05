package com.learning.leetcode;

import java.util.*;

public class Test {

	public static void main (String[] args) {
		int[] l = {7,5,4,6,3,9,2,1};
		
		for(int i=0;i<l.length;i++) {
			for(int j=0;j<l.length-1;j++) {
				if(l[j]>l[j+1]) {
					int tmp = l[j];
					l[j] = l[j+1];
					l[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(l));
	}
	
}