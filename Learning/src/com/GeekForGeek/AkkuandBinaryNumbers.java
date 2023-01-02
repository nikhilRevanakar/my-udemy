package com.GeekForGeek;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AkkuandBinaryNumbers {

//	https://practice.geeksforgeeks.org/problems/akku-and-binary-numbers0902/1
	
//	Akku likes binary numbers and she likes playing with these numbers. 
//	Her teacher once gave her a question.For given value of  L and R, 
//	Akku have to find the count of number X, which have only three-set bits
//	in it's binary representation such that "L ≤ X ≤ R".Akku is genius,
//	she solved the problem easily. Can you do it ??
//	
//	Example 1:
//
//		Input:
//		L = 11 and R = 19 
//		Output: 4
//		Explanation:
//		There are 4 such numbers with 3 set bits in 
//		range 11 to 19.
//		11 -> 1011
//		13 -> 1101
//		14 -> 1110
//		19 -> 10011
	
//	Input:
//		L = 25 and R = 29
//		Output: 3
//		Explanation:
//		There are 3 such numbers with 3 set bits in
//		range 25 to 29. 
//		25 -> 11001 
//		26 -> 11010 
//		28 -> 11100
	public static void main(String[] args) {
		long solve = solve(11, 19);
		System.out.println(solve);
	}
	
	public static long solve(long l, long r){
        // Code here
        long total = 0;
        for(long i=l;i<=r;i++) {
            long num = i;
            int cnt = 0;
            
            while(num>0) {
             if(num%2==1) {
                 cnt++;
             }   
                num = num/2;
            }
            if(cnt==3) {
                total++;
            }
            
        }
        return total;
        
        
        
    }
	
	
}
