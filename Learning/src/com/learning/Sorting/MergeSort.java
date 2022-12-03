package com.learning.Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] l = {7,5,4,6,3,9,2,1};
		int[] mergeSort = mergeSort(l);
		System.out.println(Arrays.toString(mergeSort));
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] combined = new int[arr1.length+arr2.length];
		int index = 0;
		int i=0;
		int j=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i] < arr2[j]) {
				combined[index] =arr1[i];
				index++;
				i++;
			} else {
				combined[index] =arr2[j];
				index++;
				j++;
			}
		}
		
		while(i < arr1.length) {
			combined[index] = arr1[i];
			index++;
			i++;
		}
		
		while(j < arr2.length) {
			combined[index] = arr2[j];
			index++;
			j++;
		}
		
		return combined;
	}
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);
		
		return merge(mergeSort(left), mergeSort(right));
	}

}
