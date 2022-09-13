package com.learning.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] ar = {1,1,2,2,2,2,3,4};
		
		int[] ar =  {5,2,6,8,6,7,5,2,8};
		int[] nw = new int[ar.length];
		
		int p = 0;
		
		for(int i=0;i<ar.length-1;i++) {
			boolean contains = true;
			for(int j=0;j<ar.length;j++) {
				if(ar[i] == nw[j]) {
					contains=false;
				}				
			}
			if(!contains) {
				nw[p++] = ar[i];
			}
			
		}
		
//		nw[p++] = ar[ar.length-1];
		
		System.out.println(Arrays.toString(nw));
	}

}
