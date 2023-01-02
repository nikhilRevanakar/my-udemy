package com.GeekForGeek;

import java.util.Arrays;

public class StringBubble {
	public static void main(String[] args) {
		String s ="110001001";
		char[] charArray = s.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
//		merge(charArray);
		System.out.println(Arrays.toString(charArray));
	}
	
	public static void bubble(char[] charArray) {
		for(int i=0;i<charArray.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[j]>charArray[minIndex]) {
					minIndex = j;
				}
			}
			
			if(minIndex!=i) {
				char tmp = charArray[i];
				charArray[i]= charArray[minIndex];
				charArray[minIndex] = tmp;
			}
		}
		
	}
	
	public static int[] merge(int[] a) {
		int mid = a.length/2;
		int[] left = Arrays.copyOfRange(a, 0, mid);
		int[] right = Arrays.copyOfRange(a, mid, a.length);
		
		return mergeSort(merge(left),merge(right));
	}

	private static int[] mergeSort(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int[] combined = new int[left.length+right.length];
		int ind = 0;
		int i=0;
		int j=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]>right[j]) {
				combined[ind] = left[i];
				i++;
				ind++;
			}
			else {
				combined[ind] = right[j];
				j++;
				ind++;
			}
		}
		while(i<left.length) {
			combined[ind] = left[i];
			i++;
			ind++;
		
		}
		
		while(j<right.length) {
			combined[ind] = right[j];
			j++;
			ind++;
		
		}
		
		return combined;
	}

}
