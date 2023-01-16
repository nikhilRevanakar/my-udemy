package com.FunctionalInterfaceExample;

import java.util.List;

@FunctionalInterface
public interface Multiplier {
	
	int multiply(List<Integer> list);

	public static int getSize(List<Integer> list) {
		return list.size();
	}
	
	public default boolean isEmpty(List<Integer> list) {
		return list.isEmpty();
	}
}
