package com.learning.arrays;

import java.util.Arrays;

public class ListWithOutFirstAndLastElementPart2 {

	// ip = [1,2,3,4]
	// op = [2,3]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4};
		method(ar);
	}
	
	public static void method(int[] ar) {
		int[] cpy = Arrays.copyOfRange(ar, 1, ar.length-1);
		System.out.print(Arrays.toString(cpy));
		
	}

}
