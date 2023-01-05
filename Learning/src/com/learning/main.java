package com.learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		
//      1 3 1 4 5 1 2 1 2
//      5 10 2 7 9 3 3 2 5
//        [1, 1, 2, 1, 1, 2, 4, 5, 3]
// 		[2, 2, 3, 3, 5, 5, 7, 9, 10]
		
		int[] a = {2,2,1,1,2,2,1,0,1,2,1,0,1,0,2,2,2,1,1,2,1,2,1,0,0,0,1,2,2,1,1,2,2,1,0,1,2,1,0,1,0,2,2,2,1,1,2,1,2,1,0,0,0,1,2,2,1,1,2,2,1,0,1,2,1,0,1,0,2,2,2,1,1,2,1,2,1,0,0,0,1,2,2,1,1,2,2,1,0,1,2,1,0,1,0,2,2,2,1,1,2,1,2,1,0,0,0,1};
//		quick(a, 0, a.length-1);
		
        IntStream.range(1, 10)
        .filter(s -> { if(s%3==0 || s%5==0) {
            return true;
        } else {
        return false;
        }})
        .forEach(System.out::println);
        
//        System.out.println(sum);

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
