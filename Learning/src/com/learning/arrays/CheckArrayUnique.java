package com.learning.arrays;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayUnique {

	public static void main(String[] args) {
		int[] arr = {8,21,13,4,8};
		System.out.println(isUnique(arr));
		
	}

	
	public static boolean isUnique(int[] arr) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
			else {
				return false;
			}
		}
		
		return true;
	}
}
