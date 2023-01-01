package com.learning.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChangeSimplified {

	// You are given coins of different denominations and total amount of money.
	// Find the min number of coins that you need to make up the given amt.
	// [1,2,5,10,20,50,100,1000]
	// Amount  = 2035
	// 
	public static void main(String[] args) {
		int[] a = {1,2,5,10,20,50,100,1000};
		int amt = 2035;
		coinChange(a, amt);
	}
	
	static void coinChange(int[] coins, int N) {
		Arrays.sort(coins);
		int index = coins.length-1;
		
		while(true) {
			int coinValue = coins[index];
			index--;
			
			int maxAmounnt = (N/coinValue) * coinValue;
			if(maxAmounnt>0) {
				System.out.println("Coin value: "+coinValue + " taken count: "+(N/coinValue));
				N = N-maxAmounnt; 
			}
			
			if(N==0) {
				break;
			}
		}
	}

}
