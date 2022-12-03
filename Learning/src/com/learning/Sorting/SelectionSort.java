package com.learning.Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] l = {7,5,4,6,3,9,2,1};
		int n = l.length;
		
		for(int i=0;i<l.length-1;i++) {
			int minIndex = i;
			System.out.println("MinIndex:"+i);
			for(int j=i+1;j<l.length;j++) {
				if(l[j]< l[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				int tmp= l[i];
				l[i] =l[minIndex];
				l[minIndex] = tmp;
			}
		}
		
		System.out.println(Arrays.toString(l));
	}

}
