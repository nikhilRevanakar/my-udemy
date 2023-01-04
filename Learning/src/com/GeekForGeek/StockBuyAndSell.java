package com.GeekForGeek;

import java.util.ArrayList;

public class StockBuyAndSell {

	// https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1
	public static int[] res = new int[2];

	public static void main(String[] args) {
		int a[] = {100,180,260,310,40,535,695};
		ArrayList<ArrayList<Integer>> stockBuySell = stockBuySell(a, a.length);
		
	}

	// Function to find the days of buying and selling stock for max profit.
	static ArrayList<ArrayList<Integer>> stockBuySell(int a[], int n) {
		// code here

		ArrayList<ArrayList<Integer>> main = new ArrayList<>();

		ArrayList<Integer> start = null;
		for (int i = 0; i < a.length; i++) {
			start = new ArrayList<>();
			int[] ans = check(a, i, i, i + 1);
			// System.out.println(Arrays.toString(ans));
			if (ans.length != 0) {
				start.add(ans[0]);
				start.add(ans[1]);
				i = ans[1];
				main.add(start);
			}
		}

		return main;
	}

	static int[] check(int a[], int start, int current, int next) {
		if (start != next - 1 && next == a.length) {
			res[0] = start;
			res[1] = next - 1;
			return res;
		} else if (start == next - 1 && next == a.length) {
			return new int[0];
		}

		if (start != current && a[next] < a[current]) {
			res[0] = start;
			res[1] = next - 1;
			return res;
		} else if (start == current && a[next] < a[current]) {
			return new int[0];
		}

		return check(a, start, current + 1, next + 1);
	}

}
