package com.learning.arrays;

import java.util.HashMap;

public class PairSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2,4,3,5,6,-2,4,7,8,9};
		
		method(ar, 7);
	}
	
	public static void method(int[] ar, int sum) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==sum) {
					map.put(ar[i], ar[j]);
				}
			}
		}
		
		System.out.println(map);
		
	}
}
