package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.PriorityQueue;
import java.util.stream.IntStream;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		
//      1 3 1 4 5 1 2 1 2
//      5 10 2 7 9 3 3 2 5
//        [1, 1, 2, 1, 1, 2, 4, 5, 3]
// 		[2, 2, 3, 3, 5, 5, 7, 9, 10]
		HashSet<Character> set=new HashSet<>();
		Character[] array = set.toArray(new Character[set.size()]);
		String a = "";
		a.compareTo("");
		List list = new ArrayList<>();
		list.add(10);
		Object object = list.get(0);
		Collections.sort(list);
		String a = "anc";
		a.charAt(0);
		TreeSet p = new TreeSet<>();
		p.add(30);
		p.add(29);
		p.add(88);
		p.add(11);
		p.add(60);
		
		ConcurrentHashMap<String, String> m = new ConcurrentHashMap<>();
		
		System.out.println(p);
	}
	
	static int sumA(int a, int b) {
		if(b==0) return a;
		

		System.out.println("a:b "+a+" "+b);
		int sum = a^b;

		System.out.println("sum: "+sum);
		int cry = (a & b) << 1;
		System.out.println("cry: "+cry);
		return sumA(sum, cry);
	}
	 
    public static int pivot(int[] a, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        
        for(int i=pivotIndex+1;i<=endIndex;i++) {
            if(a[i]<a[pivotIndex]) {
                swapIndex++;
                swap(a, swapIndex, i);
            }
        }
        swap(a, pivotIndex, swapIndex);
        return swapIndex;
    }
    
    public static void quick(int[] a, int left, int right) {
        if(left<right){
            int piv = pivot(a, left, right);
            quick(a, left, piv-1);
            quick(a, piv+1, right);
        }
    }
    
    public static void swap(int[] a, int first, int last ) {
        int tmp = a[first];
        a[first] = a[last];
        a[last] = tmp;
    }
	
}
