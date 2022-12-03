package com.learning.leetcode;

import java.util.*;

public class Test {

	public static void main (String[] args) {
		int[] l = {7,5,4,6,3,9,2,1};
		
		bubbleSor(l);
		System.out.println(Arrays.toString(l));
		
		int[] l2 = {7,5,4,6,3,9,2,1};
		selectionSort(l2);
		
		System.out.println(Arrays.toString(l2));

		int[] l3 = {7,5,4,6,3,9,2,1};
		insertionSort(l3);
		System.out.println(Arrays.toString(l3));

	}
	
	// Bubble Sort
	public static void bubbleSor(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[i]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
	}
	
	
	//Selection sort
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
			
		}
		
	}
	
	// Insertion Sort
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int tmp = arr[i]; 
			int j=i;
			while(j>0 && arr[j-1]> tmp) { 
				arr[j] = arr[j-1];  
				j--;
			}
			arr[j] = tmp;
		}
	}
}