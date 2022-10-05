package com.learning.Sorting;

import java.util.Arrays;

public class BubbleSort {

	// Time complexity O(n^2)
	public static void main (String[] args) {
		int[] l = {7,5,4,6,3,9,2,1};
		int n = l.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
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