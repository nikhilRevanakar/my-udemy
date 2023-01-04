package com.HackerRank;

import java.util.Scanner;

public class MultiplesOf3and5 {

	//www.hackerrank.com/contests/projecteuler/challenges/euler001/problem
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            int a = (n-1)/3;
            int b = (n-1)/5;
            int c = (n-1)/15;
            
            int sum3 = 3 * a * (a+1)/2;
            int sum5 = 5 * b * (b+1)/2;
            int sum15 = 15 * c * (c+1)/2;
            int sum = sum3+sum5-sum15;            
            System.out.println(sum);
            
        }
    }
}
