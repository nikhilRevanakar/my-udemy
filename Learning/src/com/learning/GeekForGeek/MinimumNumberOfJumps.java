package com.learning.GeekForGeek;

public class MinimumNumberOfJumps {
	
//	https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&curated[]=1&sortBy=submissions

	//	Given an array of N integers arr[] where each element 
//	represents the max length of the jump that can be made forward from that element. 
//	Find the minimum number of jumps to reach the end of the array (starting from the first element). 
//	If an element is 0, then you cannot move through that element.
//
//	Note: Return -1 if you can't reach the end of the array.
	
//	Example 1:
//
//		Input:
//		N = 11 
//		arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
//		Output: 3 
//		Explanation: 
//		First jump from 1st element to 2nd 
//		element with value 3. Now, from here 
//		we jump to 5th element with value 9, 
//		and from here we will jump to the last. 
//	Example 2:
//
//		Input :
//		N = 6
//		arr = {1, 4, 3, 2, 6, 7}
//		Output: 2 
//		Explanation: 
//		First we jump from the 1st to 2nd element 
//		and then jump to the last element.
	public static void main(String[] args) {
		int[] arr = {2,3,1,1,2,4,2,0,1,1};
		
		System.out.println(minJumps(arr));
	}
	
static int minJumps(int[] a){
        
        if(a.length==1) {
            return 0;
        }
        
        if(a[0]==0){
            return -1;
        }
        
        int range = a[0];
        int sl = a[0];
        int jump = 1;
        
        for(int i=1;i<a.length;i++) {
            if(i==a.length-1) {
                return jump;
            }
            range = Math.max(range, i+a[i]);
            sl--;
            if(sl==0) {
                jump++;
                if(range<=i) {
                    return -1;
                }
                sl = range - i;
            }
            
        }
        
        return -1 ;
    }

}
