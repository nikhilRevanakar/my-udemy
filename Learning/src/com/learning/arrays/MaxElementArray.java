package com.learning.arrays;

public class MaxElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {22,88,33,55,66,11};
		
		int max1 = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j] && arr[i]>max1) {
					
					max1 = arr[i];
					
				}
			}
		}
		
		System.out.println(max1);

		int max2 = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<max1 && arr[j]<max1) {
					if(arr[i]>arr[j] && arr[i]>max2) {
						
						max2 = arr[i];
						
					}
				}
			}
		}
		
		System.out.println(max2);

	}

}
