package com.learning.arrays;

import java.util.Scanner;

public class AverageDayTemperature {
	
	public static void main(String[] args) {
		int[] arr;
		Scanner console = new Scanner(System.in);
		System.out.println("How many days temp??");
		int numDays = console.nextInt();
		arr = new int[numDays];
		int sum = 0;
		
		for(int i =1;i<=numDays;i++) {
			System.out.print("Days "+i+" temp:");
			int next = console.nextInt();
			sum+=next;
			arr[i-1] = next;
		}
		
		double avg = sum/numDays;
		System.out.println("Avg temp is :"+avg);
		
		int exceededDays = 0;
		for(int i:arr) {
			if(i>avg) {
				exceededDays++;
			}
		}
		System.out.println(exceededDays + " these days are above average temperature");
	}
}
