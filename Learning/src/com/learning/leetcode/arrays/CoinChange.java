package com.learning.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {

	// You are given coins of different denominations and total amount of money.
	// Find the min number of coins that you need to make up the given amt.
	// [1,2,5,10,20,50,100,1000]
	// Amount  = 2035
	public static void main(String[] args) {
		List<Integer> processed = new ArrayList<>();
		int amount = 2035;
		int reamining = 0;
		
		List<Integer> list = Arrays.asList(1,2,5,10,20,50,100,1000);
		Integer integer = list.get(list.size()-1);
		
		if(integer<amount && integer>reamining) {
			reamining = amount - integer;
			processed.add(integer);
		} 
		
		if(reamining!=0) {
			for(int i=list.size()-1;i>=0;i--) {
				if(list.get(i)<=reamining) {
					reamining = reamining - list.get(i);
					processed.add(list.get(i));
					System.out.println(reamining);
				}
			}
		}
		
		System.out.println(processed);
		
		
	}

}
