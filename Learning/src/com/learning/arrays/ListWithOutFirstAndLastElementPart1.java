package com.learning.arrays;

public class ListWithOutFirstAndLastElementPart1 {

	// ip = [1,2,3,4]
	// op = [2,3]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4};
		method(ar);
	}
	
	public static void method(int[] ar) {
		for(int i=1;i<ar.length-1;i++) {
			System.out.print(ar[i]+ " ");
		}
	}

}
