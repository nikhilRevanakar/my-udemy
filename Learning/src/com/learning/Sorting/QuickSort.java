package com.learning.Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] l = {7,5,4,6,3,9,2,1};
		quickSort(l, 0 , l.length-1);
		System.out.println(Arrays.toString(l));
	}
	
	public static int pivot(int[] arr, int pivotIndex, int lastIndex) {
		int swapIndex = pivotIndex;
		
		for(int i=pivotIndex+1;i<=lastIndex;i++) {
			if(arr[i]<arr[pivotIndex]) {
				swapIndex++;
				swap(arr, swapIndex, i);
			}
		}
		
		swap(arr, pivotIndex, swapIndex);
		return swapIndex;
	}

	private static void swap(int[] arr, int pivotIndex, int i) {
		// TODO Auto-generated method stub
		int tmp= arr[pivotIndex];
		arr[pivotIndex] = arr[i];
		arr[i] = tmp;
	}
	
	private static void quickSort(int[] arr, int left, int right) {
		if(left<right) {
			int pivotIndex = pivot(arr, left, right);
			
			quickSort(arr, left, pivotIndex-1);
			quickSort(arr, pivotIndex+1, right);
		}
	}

}
