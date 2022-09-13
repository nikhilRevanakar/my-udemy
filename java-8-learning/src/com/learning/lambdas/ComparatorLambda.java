package com.learning.lambdas;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 *  STANDARD APPROACH 
		 *  
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);  // 0 -> o1 == o2
											// 1 -> o1 > o2
											// -1 -> o1 < o2
			}
		};
		
		
		System.out.println("Result is "+comparator.compare(2, 2));
		
		/*
		 * 
		 *  LAMBDA APPROACH 
		 *  
		 */
		
		Comparator<Integer> comparator2 = (o1,o2) -> o1.compareTo(o2);
		
		System.out.println("Result is "+comparator2.compare(1, 2));
		
		
	}

}
