package com.GeekForGeek;

import java.util.Arrays;

class CountInversionsInArrayUsingMergeSort
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
	
	static long cnt=0;
    
	public static void main(String[] args) {
		long arr[] = {2, 4, 1, 3, 5};
		long cnt = inversionCount(arr, arr.length);
		System.out.println(cnt);
	}
	
    static long inversionCount(long arr[], long N)
    {
        cnt=0;
        merge(arr);
       return cnt;
    }
    
    static long[] merge(long[] a) {
        if(a.length==1) {
            return a;
        }
        int mid = a.length/2;
        long[] left = Arrays.copyOfRange(a, 0, mid);
        long[] right = Arrays.copyOfRange(a, mid, a.length);
        return mergeSort(merge(left), merge(right));
    }
    
    static long[] mergeSort(long[] left, long[] right) {
        long[] combined = new long[left.length+right.length];
        int index = 0;
        int i=0;
        int j=0;
        int p=0;
        int q=0;
        
        while(i<left.length && j<right.length) {
            while(p<left.length && q<right.length) {
                if(left[p]>right[q]) {
                    int t = left.length-p;
                    cnt = cnt+t;
                    q++;
                } else {
                    p++;
                }
                
            }
            if(left[i]<right[j]) {
                combined[index] = left[i];
                i++;
                index++;
            } else {
                combined[index] = right[j];
                j++;
                index++;
                // cnt++;
            }
        }
        while(i<left.length) {
            combined[index] = left[i];
            i++;
            index++;
            // cnt++;
        }
        while(j<right.length) {
            combined[index] = right[j];
            j++;
            index++;
            // cnt++;
        }
        
        return combined;
        
    }

    
}