package com.FunctionalInterfaceExample;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = Arrays.asList(5,5);
		 Multiplier multiplier2 = (a) -> {
			 
			 
			 return a.stream().reduce(1, (x,y) -> x*y);
					};
		 
		 System.out.println(compute(multiplier2, lst));
	}
	
	public static int compute(Multiplier multiplier, List<Integer> lst) {
		return multiplier.multiply(lst);
	}

}
