package com.learning.arrays;

public class FindFirstAndSecondBestScorePart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in = {11,99,223,43,22,96}
		// op = {223,99}
		
		int[] ar = {84,94,82,95,77,88,60,75};
		int firstScore = 0;
		int secondScore = 0;
		
		
		for(int i =0;i<ar.length;i++) {
			if(ar[i]>firstScore) {
				firstScore=ar[i];
			}
		}
		for(int i =0;i<ar.length;i++) {
			if(ar[i]!=firstScore && ar[i]>secondScore) {
				secondScore=ar[i];
			}
		}
		
		System.out.println(firstScore + " "+secondScore);

	}

}
