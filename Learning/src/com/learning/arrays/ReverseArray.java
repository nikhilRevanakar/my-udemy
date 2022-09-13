package com.learning.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5};
		reverse(arr);
	}
	
	public static void reverse(int[] arr) {
		System.out.println(arr.length/2);
		for(int i=0;i<arr.length/2;i++) {
			int other = arr.length-i-1;
			int temp = arr[i];
			arr[i] = arr[other];
			arr[other] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
