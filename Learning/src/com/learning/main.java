package com.learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		
//      1 3 1 4 5 1 2 1 2
//      5 10 2 7 9 3 3 2 5
//        [1, 1, 2, 1, 1, 2, 4, 5, 3]
// 		[2, 2, 3, 3, 5, 5, 7, 9, 10]
		
		int[] a = {1, 4, 3, 2, 6, 7};
		System.out.println(minJumps(a));
	}
	
	 static int minJumps(int[] a){
		 int jumps = 0;
	        int idx = 0;
	        while(idx<a.length) {
	            if(a[idx]==0) {
	                return -1;
	            }
	            
	            idx = idx+a[idx];
	           
	            if(idx!=a.length-1) {
	            	jumps++;
	            }
	            
	        }
		       
		       
		       return jumps;
	    }
	
	
}
