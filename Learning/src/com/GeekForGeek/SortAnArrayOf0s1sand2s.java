package com.GeekForGeek;

public class SortAnArrayOf0s1sand2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0, 2, 1, 2, 0};
		sort012(a, a.length);

	}
	
	public static void sort012(int a[], int n)
    {
        // code here 
        // quick(a, 0, n-1);
        int low=0;
        int mid=0;
        int high=n-1;
        int tmp=0;
        while(mid<=high) {
            switch(a[mid]){
                
                case 0: {
                        tmp = a[low];
                        a[low] = a[mid];
                        a[mid] = tmp;
                        low++;
                        mid++;
                        break;
            }
                case 1:
                    mid++;
                    break;
                case 2:{
                        tmp = a[high];
                        a[high] = a[mid];
                        a[mid] = tmp;
                        
                        high--;
                        break;
                }
            }
                
        }
        
    }

}
