package com.learning.Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,4,6,3,9,2,1};
		for(int i=1;i<arr.length;i++) {
			int tmp = arr[i];
			int j=i;
			while(j>0 && arr[j-1]>tmp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
