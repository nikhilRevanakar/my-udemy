package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> subarraySum = subarraySum(new int[]{1,2,3,7,5}, 5, 12);
		System.out.println(subarraySum);
		HashMap<Integer, Integer> map = new HashMap<>();
		
	}
	
	static ArrayList<Integer> subarraySum(int[] a, int n, int sum) 
    {
        
        ArrayList<Integer> lst = new ArrayList<Integer>();
        int l = 0;
        int r = 0;
        int curSum = 0;
        while(l<a.length && r<a.length){
            curSum+=a[r];
            
            if(!lst.isEmpty()) {
                break;
            }
            if((curSum - sum) ==0) {
                lst.add(l+1);
                lst.add(r+1);
                break;
            } else if(curSum>sum) {
                while(curSum>sum) {
                    curSum = curSum-a[l];
                    l = l+1;
                    if((curSum-sum)==0) {
                        int t = l;
                        int e = r;
                        lst.add(t+1);
                        lst.add(e+1);
                        break;
                    }
                }
            } else if(curSum<sum) {
                r++;
            }
        }
        
        if(lst.isEmpty()){
            lst.add(-1);
        }
        return lst;
        
        
    }
}