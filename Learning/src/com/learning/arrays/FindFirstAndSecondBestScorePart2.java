package com.learning.arrays;

import java.util.Arrays;
import java.util.Collections;

public class FindFirstAndSecondBestScorePart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in = {11,99,223,43,22,96}
		// op = {223,99}
		
		Integer[] ar = {84,94,82,95,77,88,60,75};
		Arrays.sort(ar, Collections.reverseOrder());
		
		int firstScore = ar[0];
		int secondScore = 0;
		
		
		for(int i =0;i<ar.length;i++) {
			if(ar[i]!=firstScore) {
				secondScore=ar[i];
				break;
			}
		}
		
		System.out.println(firstScore + " "+secondScore);

	}

}
